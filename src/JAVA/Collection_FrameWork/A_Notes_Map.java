package JAVA.Collection_FrameWork;

public class A_Notes_Map {
    /*

    HasMap
    -Unordered
    -Duplicate key's not allowed.
    -Duplicate value allowed
    -Null Not Allowed

    LinkedHashMap
    -follows Insertion order.
    -Duplicate key's NOT allowed.
    -Duplicate value allowed.
    -Null Not Allowed


    TreeMap
    -Automatically sort by key.
    -Duplicate key's not allowed.
    -Duplicate value allowed.
    -Null Not Allowed

| Interface | Class             | Order      | Null Key   | Null Value | Thread-Safe | Notes / Use Case                |
| --------- | ----------------- | ---------- | ---------- | ---------- | ----------- | ------------------------------- |
| Map       | HashMap           | ❌ No      | ✅ One    | ✅ Many     | ❌ No        | Fastest, most used              |
| Map       | LinkedHashMap     | ✅ Yes     | ✅ One    | ✅ Many     | ❌ No        | Insertion order                 |
| Map       | TreeMap           | 🔄 Sorted  | ❌ No     | ✅ Many     | ❌ No        | Sorted by key                   |
| Map       | Hashtable         | ❌ No      | ❌ No     | ❌ No       | ✅ Yes       | Legacy                          |
| Map       | ConcurrentHashMap | ❌ No      | ❌ No     | ❌ No       | ✅ Yes       | Best for concurrency            |
| Map       | EnumMap           | Enum order | ❌ No     | ✅ Yes      | ❌ No        | Enum keys only                  |


     */
}
