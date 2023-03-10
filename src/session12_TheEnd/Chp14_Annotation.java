package session12_TheEnd;
/**
 * Target and Retention Optional declaration. For example:
 *  + @Target(ElementType.TYPE)
 *  + @Retention(RetentionPolicy.RUNTIME)
 */
@interface AnnotationsTest {}
@interface Chp14_Annotation{
 
    String language();  //as the same abstract method without parameter
    String desc();
}
class TestAnnotation{
    @AnnotationsTest
    @Chp14_Annotation(language = "Java SE 8", desc = "Testing Annotations")
    public void test(){
        System.out.println("Annotaion testing...");
    }
    public static void main(String[] args) {
        new TestAnnotation().test();
    }
}
