package chap6._11;

interface MyInter {
    public default boolean equals(Object obj) {
        return true;
    }

    public default int hashCode() {
        return 10;
    }

    public default String toString() {
        return "hello";
    }
}
