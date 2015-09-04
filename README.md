# molymer (experimental)

Molymer is an eclipse plugin targeting MDD (Model-Driven Development). It's in an experimental phase, but the grammar for the modeling language is almost finished. It has dependencies of Xtext and Xtend eclipse projects.

Necessary core plugins are: 
* **org.molymer** - definition of the modeling language targeting file types *.mdsl normally put on the source folder.
* **org.molymer.ui** - eclipse language editor
* **org.molymer.conf** - definition of the config language targeting file types *.mconf normally put on the project root folder.
* **org.molymer.conf.ui** - eclipse config editor

Once installed you are able to define the model and config the generators. Generators are simple OSGi plugins (no activator is necessary) with a class implementing org.eclipse.xtext.generator.IGenerator. Examples of generators are a work in progress.

Config files have a format like:
```java
config {
	appName = "Molymer Test"
	mainClass = "MolymerApp"
	
	srcFolder = "src"
	outFolder = "src-gen"
	
	generators {
		ui = "<generator bundle name>" : "<generator class in the bundle>"
		[other generators ...]
	}
}
```

You can start a model by defining some defaults (datatypes and annotations), e.g:
```java
datatype string { @regex'.*' }
datatype number { @regex'^[0-9]+$' }

datatype date { @date'yyyy-MM-dd' }
datatype time { @date'HH:mm:ss' }
datatype datetime { date @regex' ' time }

[#reference-list]
annotation range {
	value : #int-range
}

[#entity]
annotation access {
	roles : #group "access"
}

[#group "access"]
annotation read {
	groups : #string*
}

[#group "access"]
annotation write {
	groups : #string*
}
```
Data Types and Annotations are normally directly related and interpreted by some generator.
Annotations have mandatory markers that constrain their positions to a linked model. Like for example [#entity] denotes that this annotation can only be used in **entity** definitions. And [#group "access"] creates a restriction link based on group name, these annotations can only be used inside other annotations that have a property of type #group "access".

And then your model e.g:
```java
entity Address {
	group inline {
		country : string
		city : string
	}
	
	group inline2 {
		street : string
		door : number
	}
}

package people {
	
	[access [read "all" write "owner"] ]
	entity Person {
		name : string
		birthday : date
		optional? : string
		
		address --> Address
	}
	
	entity Student {
		:parent-> Person
		
		mathTeacher --> Teacher
		physicTeacher --> Teacher
	}
	
	entity Teacher {
		:parent-> Person
		
		mathStudents -mathTeacher-< Student [range 5..30]
		physicStudents -physicTeacher-< Student [range 5..30]
	}
}
```
In an entity you can have: 
* properties in the format ```<name> [?] : <datatype> [annotations marked with #property]```
* references in the format ```<name> [?] --> <entity> [annotations marked with #reference]```
* reference lists in the format ```<name> [?] -[link to inverse reference]-< <entity> [annotations marked with #reference-list]```
* parent ownership in the format ```:parent-> <entity> [annotations marked with #parent]```
* childs from a parent ownership in the format ```:childs-< <entity> [annotations marked with #child]```

Parent and childs are a kind of composite relations. When translated to generated code it normally means that the parent entity has some methods like "createChild" and "deleteChild" and the child entity must accept the parent in the constructor. But these generated results are really up to the generator.
