# Inheritance and Delegation

The handout for Lab 3 can be found at: [https://github.com/CMU-17-214/s2026/blob/main/labs/lab03.md](https://github.com/CMU-17-214/s2026/blob/main/labs/lab03.md)

> Which is more dependent on the implementation details of the SortedIntList, delegation or inheritance?

The inheritance implementation is more dependent on the implementation details of `SortedIntList`. It directly extends the class so that any changes in the superclass can have a direct impact on the subclass. 


> If the add method in SortedIntList is significantly modified or its behavior changes, which implementation is more likely to break?

The inherirance implementation. **High couling**: Coupled to implementation details that cannot be controlled by the subclass, it is more susceptible to breakage if the `add` method in `SortedIntList` is modified.

Also, If the `addAll` method in `SortedIntList` is modified to not use the `add` method internally, we should explicitly override `addAll` in the subclass to compute `totalAdded` correctly.

> What issues does using delegation solve that might have been problematic with inheritance?

It solves issues related to **tight coupling**. Delegation allows the `DelegationSortedIntList` to use the `SortedIntList` without being tightly coupled to its implementation details. This means that changes in the `SortedIntList` class are less likely to break the `DelegationSortedIntList`, as it relies on the public interface rather than the internal workings of the superclass.

> Based on the provided implementations, when would it be more appropriate to use inheritance and when to use delegation?

Inheritance is more appropriate when there is a clear **"is-a"** relationship. It is suitable when the subclass needs to leverage the existing functionality of the superclass while adding new features.