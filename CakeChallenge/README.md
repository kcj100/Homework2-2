# Notes from Chapter 3 and 4 (Head First Java, 2nd Edition)

- "Variables come in two flavors: <em>primitive</em> 
and <em>object reference</em>" (page 50, chapter 3)
- Variables' first letter can be a dollar sign"$" 
or an underscore(_) (page 53, chapter 3)
- "There is actually no such thing as an object variable."
"There's only an object reference variable." (page 54, chapter 3)
- "A class is the blueprint for an object." (page 72, chapter 4)
- "A method uses parameters. A caller passes arguments." (page 74, chapter 4)
- It is a good idea to make instance variables private
and use setter methods within a class so that an instance variable
cannot be directly modified. It can instead use a setter method that might
come with a if statement to make sure that a value is safe to pass. (page 80-82, chapter 4)
- Instance variables are declared within a class,
Local variables are declared within a method.
Initializing a instance variable is not required, but 
a local variable must be initialized before use. (page 85, chapter 4)
- "The == operator can be used to compare two variables of any kind,
and it simply compares the bits." (page 86, chapter 4)