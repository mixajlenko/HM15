package org.hillel.home_work15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationAnalyzer implements ICodeAnalyze {

    @Override
    public void analyzeClass(Class<?> clazz) throws Exception {

        int methodAnotated = 0;
        int methodFree = 0;
        int fieldAnnotated = 0;
        int fieldFree = 0;
        int constructorAnnotated = 0;
        int constructorFree = 0;

        for (Field f : ArrayProgram.class.getDeclaredFields()) {
            fieldFree++;
            if (f.isAnnotationPresent(Analyzable.class)) {
                System.out.println("Variable (" +
                        f.getName() +
                        ") is annotated. Annotation name is: " +
                        Analyzable.class.getSimpleName() + " ");

                fieldAnnotated++;
            }
        }
        System.out.printf("Annotated: %d, Free: %d%n\n",
                fieldAnnotated, fieldFree - fieldAnnotated);

        for (Method m : ArrayProgram.class.getDeclaredMethods()) {
            methodFree++;
            if (m.isAnnotationPresent(Analyzable.class)) {
                System.out.println("Method (" +
                        m.getName() +
                        Arrays.toString(m.getParameterTypes()) +
                        ") is annotated. Annotation name is: " +
                        Analyzable.class.getSimpleName());
                methodAnotated++;
            }
        }
        System.out.printf("Annotated: %d, Free: %d%n\n",
                methodAnotated, methodFree - methodAnotated);

        for (Constructor c : ArrayProgram.class.getDeclaredConstructors()) {
            constructorFree++;
            if (c.isAnnotationPresent(Analyzable.class)) {
                System.out.println("Constructor (" +
                        c.getDeclaringClass().getSimpleName() +
                        Arrays.toString(c.getParameterTypes()) +
                        ") is annotated. Annotation name is: " +
                        Analyzable.class.getSimpleName());
                methodAnotated++;
            }
        }
        System.out.printf("Annotated: %d, Free: %d%n\n",
                constructorAnnotated, constructorFree - constructorAnnotated);
    }
}
