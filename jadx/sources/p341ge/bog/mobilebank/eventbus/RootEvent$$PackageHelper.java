package p341ge.bog.mobilebank.eventbus;

/* renamed from: ge.bog.mobilebank.eventbus.RootEvent$$PackageHelper */
public class RootEvent$$PackageHelper {
    public static int accessRootEvent$FG$currentState(RootEvent rootEvent) {
        return rootEvent.currentState;
    }

    public static String accessRootEvent$FG$error(RootEvent rootEvent) {
        return rootEvent.error;
    }

    public static String accessRootEvent$FG$errorKey(RootEvent rootEvent) {
        return rootEvent.errorKey;
    }

    public static void accessRootEvent$FS$currentState(RootEvent rootEvent, int i) {
        rootEvent.currentState = i;
    }

    public static void accessRootEvent$FS$error(RootEvent rootEvent, String str) {
        rootEvent.error = str;
    }

    public static void accessRootEvent$FS$errorKey(RootEvent rootEvent, String str) {
        rootEvent.errorKey = str;
    }
}
