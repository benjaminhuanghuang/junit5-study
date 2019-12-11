## Unit test sequence
- Setup
- Exercise
- Verify
- Teardown

## Test doubles
- A dummy object simply satisfies the real object API but it is never actually used. 
    The typical use case for dummy objects is when they are passed as parameters to meet the method signature, but then the dummy object is not actually used.

- A fake object replaces the real object with a simpler implementation, for example, an in-memory database.

- A stub object replaces the real object providing hard-coded values as responses.

- A mock object also replaces the real object, but this time with programmed expectations as responses.

- A spy object is a partial mock object, meaning that some of its methods are programmed with expectations, but the others use the real object's implementation.
