package DesignPatterns.Factory;

public class UIFactory_Abstraction {
    public static UIFactory getUIFactory(SupportedPlatform platform){
        if(platform.equals(SupportedPlatform.ANDROID)){
            return new Android_UIFactory();
        }else if(platform.equals(SupportedPlatform.IOS)){
            return new IOS_UIFactory();
        }
        return null;
    }
}
