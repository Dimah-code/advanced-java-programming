package unit_07.Exercises.Exercise_06;

public class Exercise_7_6 {
    public static void main(String[] args) {
        Computer comp = new Computer("Intel i7", 3.5);
        MultimediaComputer mcomp = new MultimediaComputer("AMD Ryzen 5", 4.0, 52.0);
        
        System.out.println(comp);
        System.out.println("Processor: " + comp.getProcessorType() + ", Speed: " + comp.getSpeed());
        System.out.println(mcomp);
        System.out.println("CD-ROM Speed: " + mcomp.getCdRomSpeed());

    }
}
