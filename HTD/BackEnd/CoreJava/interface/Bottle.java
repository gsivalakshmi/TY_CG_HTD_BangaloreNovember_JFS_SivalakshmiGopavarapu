
public interface Bottle {
 void open();
 
 void drink();
 public default void juice() {
	 System.out.println("juice name is");
 }
 public static void close() {
	 System.out.println("close the bottle");
 }
}
