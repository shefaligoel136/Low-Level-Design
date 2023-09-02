package DesignPatterns.Factory;

public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("Setting Theme");
    }

//    UIFactory createFactory(SupportedPlatform platform){
////        OCP VIOLATION.
//        if(platform.equals(SupportedPlatform.ANDROID)){
//            return new Android_UIFactory();
//        }else {
//            return new IOS_UIFactory();
//        }
//    }

    UIFactory createFactory(SupportedPlatform platform){
        return UIFactory_Abstraction.getUIFactory(platform);
    }
}
