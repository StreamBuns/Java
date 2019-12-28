public class Shapes {
    public static Shape randShape() {
        switch((int)(Math.random() * 3)) {
            //用数学随机函数返回值确定返回的空间类型
            default: // To quiet the compiler
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
    public static void main(String[] args) {
        Shape[] s = new Shape[3];  // Fill up the array with shapes:
        //建立父类的数组
        for(int i = 0; i <s.length; i++)
            s[i] = randShape(); // Make polymorphic method calls:
        //为每一个元素分配空间
        for(int i = 0; i <s.length; i++)
            s[i].draw();
        //利用父类函数来调用子类中重载的函数
    }
}
