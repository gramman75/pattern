package pattern.abstractFactory.factory.java;

import pattern.abstractFactory.listFactory.java.*;
public abstract class Factory {
    public static Factory getFactory(String className){
        Factory factory = null;
        try{
//            factory = (Factory)Class.forName(className).getDeclaredConstructor().newInstance();
            factory = (Factory)Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e){
            System.err.println("클래스 "+className+"가 발견되지 않습니다.");
        } catch (Exception e){
            e.printStackTrace();
        }

        return factory;

    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);


}
