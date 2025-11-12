package JAVA.Collection_FrameWork;

public class A_Notes_List_Set_Map {

    /*
| **Interface** | **Subtype / Implementation** | **Ordering**                  | **Duplicates Allowed**  | **Null Allowed**                       | **Key Feature**                                  | **Typical Use Case**                                  |
| ------------- | ---------------------------- | ----------------------------- | ----------------------- | ---------------------------------------| ------------------------------------------------ | ----------------------------------------------------- |
| **List**      | **ArrayList**                | Maintains insertion order     | ✅ Yes                  | ✅ Yes (one null)                     | Fast random access, slow insert/delete in middle | Storing ordered data like test steps, usernames, etc. |
|               | **LinkedList**               | Maintains insertion order     | ✅ Yes                  | ✅ Yes (multiple nulls)               | Fast insert/delete, slower access                | Implementing queues or linked structures              |
|               | **Vector**                   | Maintains insertion order     | ✅ Yes                  | ✅ Yes                                | Synchronized (thread-safe)                       | Legacy thread-safe list                               |
|               | **Stack** *(extends Vector)* | Maintains insertion order     | ✅ Yes                  | ✅ Yes                                | LIFO (Last In First Out)                         | Undo operations, browser history                      |
| **Set**       | **HashSet**                  | Unordered                     | ❌ No                   | ✅ Yes (one null)                     | Fast lookup, unique elements                     | Storing unique test IDs, usernames                    |
|               | **LinkedHashSet**            | Maintains insertion order     | ❌ No                   | ✅ Yes (one null)                     | Predictable iteration order                      | Unique elements with preserved order                  |
|               | **TreeSet**                  | Sorted (ascending by default) | ❌ No                   | ❌ No                                 | Uses TreeMap internally, sorted order            | Sorted unique values                                  |
| **Map**       | **HashMap**                  | Unordered                     | Keys ❌ / Values ✅      | ✅ One null key, multiple null values | Fast key-value lookup                            | Storing test data (key-value pairs)                   |
|               | **LinkedHashMap**            | Maintains insertion order     | Keys ❌ / Values ✅      | ✅ Yes                                | Predictable iteration order                      | Caching or ordered mappings                           |
|               | **TreeMap**                  | Sorted by key                 | Keys ❌ / Values ✅      | ❌ No null keys                       | Sorted key-value pairs                           | Sorted test data or configurations                    |
|               | **Hashtable**                | Unordered                     | Keys ❌ / Values ✅      | ❌ No nulls                           | Thread-safe (synchronized)                       | Legacy thread-safe map                                |
|               | **ConcurrentHashMap**        | Unordered                     | Keys ❌ / Values ✅      | ❌ No nulls                           | High-performance thread-safe map                 | Multi-threaded applications                           |

    * */
}