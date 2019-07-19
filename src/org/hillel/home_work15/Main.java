package org.hillel.home_work15;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayProgram arrayprogram = new ArrayProgram();
        //arrayprogram.logic();
        AnnotationAnalyzer analyze = new AnnotationAnalyzer();
        analyze.analyzeClass(ArrayProgram.class);
    }
}



