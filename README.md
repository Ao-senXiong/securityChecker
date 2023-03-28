### Security Checker based on The Checker Framework
Motivation: fine-grained control of input information and further secure the system.

##### A link to your source repository:
https://github.com/Ao-senXiong/securityChecker
##### Links to CI executions of your test cases
https://github.com/Ao-senXiong/securityChecker/actions


##### description of the lattice
In the lattice, we have four qulifiers: @untrusted, @trusted and @safe.

Within the scope of @untrusted, 
the argument is likely coming from unknown user.
If the system want to use the argument in any way, 
it should be sanitized and verified by a sanitizer and format checker.

Within the scope of @trusted, 
the argument is from trusted source which implies its aim is harmless.
However, it may need to be passed to a format checker to make its sure it is correct.

Within the scope of @safe,
the argument is considered from the trusted source in the right format.

##### what type rules are implemented

For the current version of security checker, 
I only inherite the type rules from the base type checker. 

##### any flow-sensitive type refinements you implemented

TODO:

##### Can you think of further refinements to your type system or a combination with other analyses that would improve the analysis?

TODO:

##### Can your type system have false positives or false negatives? What do these terms mean in this case?

TODO:

##### Any observations about the Checker Framework

TODO:
