### Security Checker based on The Checker Framework
Motivation: fine-grained control of input information and further secure the system.

##### A link to your source repository:
https://github.com/Ao-senXiong/securityChecker
##### Links to CI executions of your test cases
https://github.com/Ao-senXiong/securityChecker/actions


##### Description of the lattice
In the lattice, we have four qualifiers: @untrusted, @trusted and @safe.
```mermaid
flowchart BT;
A[&#64Safe] --> B[&#64Trusted];
B --> C[&#64Untrusted];
```
Within the scope of @untrusted, 
the argument is likely coming from unknown user.
If the system want to use the argument in any way, 
it should be sanitized and verified by a sanitizer and format checker.

Within the scope of @trusted, 
the argument is from trusted source which implies its aim is harmless.
However, it may need to be passed to a format checker to make its sure it is correct.

Within the scope of @safe,
the argument is considered from the trusted source in the right format.

##### What type rules are implemented

For the current version of security checker, 
I only inherit the type rules from the base type checker. 

##### Any flow-sensitive type refinements you implemented

No, 
but I believe an interesting one is make if an @Untrusted field ever accepts @Safe argument,
its type becomes @Safe and can not accept argument @Untrusted and @Trusted.

##### Can you think of further refinements to your type system or a combination with other analyses that would improve the analysis?

Certainly, an interesting direction is to add sanitizer and formatter,
which could convert type from @Untrusted to @Trusted and @Trusted to @Safe and not simply define a new string.
Also, it would be great if error report could be more precise on the specific location.

##### Can your type system have false positives or false negatives? What do these terms mean in this case?

Yes, if the feature is not covered by subtyping relationship of basetypechecker
then there would definitely be false positives.
And if the type rules implemented are wrong, there would be false negatives.
False positives, e.g., there is no false use of assignment, return and et al.
However, the checker still issues compile time error.
False negatives, e.g., if the user try to assign an @Untrusted value to @Safe variable,
the checker did not issue any error at compile time which causes security vulnerability at run time.
##### Any observations about the Checker Framework
I find it I could not assign value to variable when my checker is on.