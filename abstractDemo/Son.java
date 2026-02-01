public class Son extends Parent {
 
	pubic Son(int age) {
		super(age);
	}

    @Override
    void career() {
        System.out.println("I am going to be a doctor.");
    }
    
    @Override
    void partner() {
        System.out.println("Son's partner");
    }
    
}
