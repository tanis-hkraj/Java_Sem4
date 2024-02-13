class String_06 {
    // Strings are immutable type in java
    // Concatenating doesn't mean that two String objects are joined or appended.
    // In java, strings are an obj that represents sequence of char values
    // Strings in java are immutable and cannot be changed
    // Whenever we create a string, the JVM checks the "String Constant pool" first.if the string already exists in the pool, a reference to the pooled instance is returned, if the string doesn't exists int the pool, a new string instance is created and placed in the pool
    // This makes JAVA memory efficient, because no new obj are created if it already exists in the SCP
    // String afunctions in Java
    public static void main(String[] args) {
        String s1="Hello";
        System.out.println(s1.length());
        // String Buffer class is used to create mutable string instances
        StringBuffer sb=new StringBuffer();
        sb.append("hello");
        sb.insert(2, "Sha");
        System.out.println(sb);
    }
}
