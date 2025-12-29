package JAVA.Collection_FrameWork;

public class A_Notes_List {

    /*
    List
    -Duplicate allowed.
    -we can not add another element once class loading is done.
    -can add null.

    ARRAY LIST
    -Duplicate allowed.
    -can add heterogeneous data type.
    -can add null.
    -it follows insertion order.
    -No size limitations.
    -we can add another element once class loading is done.
    -it is not a thread safety, so it is fast.

    LINKED List
    -same as Array list.
    -memory consumption is more bcs it stores next and previous reference along with the data.

| Interface | Class                | Order | Duplicates | Thread-Safe | Notes / Use Case       |
| --------- | -------------------- | ----- | ---------- | ----------- | ---------------------- |
| List      | ArrayList            | ✅ Yes | ✅ Yes      | ❌ No        | Fast access, most used |
| List      | LinkedList           | ✅ Yes | ✅ Yes      | ❌ No        | Fast insert/delete     |
| List      | Vector               | ✅ Yes | ✅ Yes      | ✅ Yes       | Legacy, synchronized   |
| List      | Stack                | ✅ Yes | ✅ Yes      | ✅ Yes       | LIFO, legacy           |

*/
}