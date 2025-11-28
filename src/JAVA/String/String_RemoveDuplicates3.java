package JAVA.String;




class String_RemoveDuplicates3 {
    public static void main(String[] args) throws InterruptedException {
        // Using StringBuilder (Not Thread-Safe)
        StringBuilder sb = new StringBuilder();

        // Using StringBuffer (Thread-Safe)
        StringBuffer sbf = new StringBuffer();

        // Create two threads that modify the same object
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sb.append("A");
                sbf.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                sb.append("B");
                sbf.append("B");
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both to finish
        t1.join();
        t2.join();

        System.out.println("StringBuilder length: " + sb);
        System.out.println("StringBuffer length: " + sbf);
        System.out.println("StringBuilder length: " + sb.length());
        System.out.println("StringBuffer length: " + sbf.length());
    }
}
