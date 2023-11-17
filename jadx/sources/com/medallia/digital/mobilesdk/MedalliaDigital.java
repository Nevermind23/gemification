package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.MDExternalError;
import java.util.HashMap;

public class MedalliaDigital {
    private static final C11066q3 killSwitch = new C11066q3();
    private static C10956l4 medalliaDigitalBrain;

    public static void closeEngagement(MDResultCallback mDResultCallback) {
        MDExternalError mDExternalError;
        C10735b4.m39113e("Close Engagement was called");
        if (isBelowApi21()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
        } else if (isSdkStopped()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
        } else if (isSdkKilled()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
        } else {
            C10956l4 l4Var = medalliaDigitalBrain;
            if (l4Var != null) {
                l4Var.mo28666a(mDResultCallback);
                return;
            } else if (mDResultCallback != null) {
                MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED);
                C10735b4.m39111c(mDExternalError2.getMessage());
                mDResultCallback.onError(mDExternalError2);
                return;
            } else {
                return;
            }
        }
        C10735b4.m39111c(mDExternalError.getMessage());
        mDResultCallback.onError(mDExternalError);
    }

    public static void customInterceptTrigger(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        if (isBelowApi21()) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
            C10735b4.m39111c(mDExternalError.getMessage());
            mDFailureCallback.onError(mDExternalError);
        } else if (isSdkStopped()) {
            MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
            C10735b4.m39111c(mDExternalError2.getMessage());
            mDFailureCallback.onError(mDExternalError2);
        } else if (isSdkKilled()) {
            MDExternalError mDExternalError3 = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
            C10735b4.m39111c(mDExternalError3.getMessage());
            mDFailureCallback.onError(mDExternalError3);
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.mo28671a(str, mDInterceptActionType, mDFailureCallback);
        }
    }

    public static void disableIntercept() {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28675a(false);
            }
        }
    }

    public static void enableIntercept() {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28675a(true);
            }
        }
    }

    protected static C10956l4 getMedalliaDigitalBrain() {
        return medalliaDigitalBrain;
    }

    public static void handleNotification(String str, MDResultCallback mDResultCallback) {
        if (isBelowApi21()) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
            C10735b4.m39111c(mDExternalError.getMessage());
            mDResultCallback.onError(mDExternalError);
        } else if (isSdkStopped()) {
            MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
            C10735b4.m39111c(mDExternalError2.getMessage());
            mDResultCallback.onError(mDExternalError2);
        } else if (isSdkKilled()) {
            MDExternalError mDExternalError3 = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
            C10735b4.m39111c(mDExternalError3.getMessage());
            mDResultCallback.onError(mDExternalError3);
        } else {
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.mo28672a(str, mDResultCallback);
        }
    }

    public static void init(Application application, String str, MDResultCallback mDResultCallback) {
        if (isBelowApi21()) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED));
        } else if (application == null) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.APPLICATION_IS_NULL));
        } else {
            if (C10884i4.m39721c().mo28483b() == null) {
                C10884i4.m39719a(application);
                if (isSdkStopped()) {
                    mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED));
                    return;
                } else {
                    C11164w3.m40939b();
                    C11089s6.m40668b().mo28977a((Context) application);
                }
            }
            if (isSdkStopped()) {
                mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED));
                return;
            }
            C10735b4.m39113e("SDK init started");
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.mo28677b(str, mDResultCallback);
        }
    }

    protected static void initMedalliaDigitalBrainIfNecessary() {
        if (medalliaDigitalBrain == null) {
            medalliaDigitalBrain = new C10956l4();
        }
    }

    private static boolean isBelowApi21() {
        return false;
    }

    private static boolean isSdkKilled() {
        return killSwitch.mo28940b();
    }

    private static boolean isSdkStopped() {
        return C11089s6.m40668b().mo28980a(C11089s6.C11090a.SDK_STOPPED, false);
    }

    public static void revertStopSDK() {
        if (!isBelowApi21()) {
            if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
                return;
            }
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.mo28685h();
        }
    }

    public static void setActivity(Activity activity) {
        C10735b4.m39113e("setActivity was called");
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28659a(activity);
            }
        }
    }

    public static void setCustomAppearance(MDAppearanceMode mDAppearanceMode) {
        C10735b4.m39113e("setCustomAppearance was called");
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28660a(mDAppearanceMode);
            }
        }
    }

    public static void setCustomInterceptListener(MDCustomInterceptListener mDCustomInterceptListener) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28661a(mDCustomInterceptListener);
            }
        }
    }

    public static void setCustomParameter(String str, Object obj) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28673a(str, obj);
            }
        }
    }

    public static void setCustomParameters(HashMap<String, Object> hashMap) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28674a(hashMap);
            }
        }
    }

    public static void setDebugForm(boolean z) {
        C10735b4.m39113e("setDebugForm was called");
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28681c(z);
            }
        }
    }

    public static void setFeedbackListener(MDFeedbackListener mDFeedbackListener) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28662a(mDFeedbackListener);
            }
        }
    }

    public static void setFormListener(MDFormListener mDFormListener) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28663a(mDFormListener);
            }
        }
    }

    public static void setInterceptListener(MDInterceptListener mDInterceptListener) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28664a(mDInterceptListener);
            }
        }
    }

    public static void setLogLevel(MDLogLevel mDLogLevel) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28665a(mDLogLevel);
            }
        }
    }

    public static void setSdkFramework(MDSdkFrameworkType mDSdkFrameworkType) {
        if (!isBelowApi21()) {
            C10735b4.m39113e("setSdkFramework was called");
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28667a(mDSdkFrameworkType);
            }
        }
    }

    public static void setUserId(String str) {
        C10735b4.m39113e("setUserId was called");
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28669a(str);
            }
        }
    }

    public static void showForm(String str, MDResultCallback mDResultCallback) {
        MDExternalError mDExternalError;
        C10735b4.m39113e("Show form was called");
        if (isBelowApi21()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.OS_VERSION_IS_NOT_SUPPORTED);
        } else if (isSdkStopped()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED);
        } else if (isSdkKilled()) {
            mDExternalError = new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED);
        } else {
            C10956l4 l4Var = medalliaDigitalBrain;
            if (l4Var != null) {
                l4Var.mo28680c(str, mDResultCallback);
                return;
            } else if (mDResultCallback != null) {
                MDExternalError mDExternalError2 = new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED);
                C10735b4.m39111c(mDExternalError2.getMessage());
                mDResultCallback.onError(mDExternalError2);
                return;
            } else {
                return;
            }
        }
        C10735b4.m39111c(mDExternalError.getMessage());
        mDResultCallback.onError(mDExternalError);
    }

    public static void stopSDK(boolean z) {
        if (!isBelowApi21()) {
            if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
                return;
            }
            initMedalliaDigitalBrainIfNecessary();
            medalliaDigitalBrain.mo28682d(z);
        }
    }

    protected static void updateBrainOnMigration() {
        medalliaDigitalBrain = null;
        initMedalliaDigitalBrainIfNecessary();
    }

    public static void updateCustomLocale(String str, MDCallback mDCallback) {
        if (!isBelowApi21()) {
            if (isSdkStopped()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_WAS_STOPPED).getMessage());
            } else if (isSdkKilled()) {
                C10735b4.m39111c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED).getMessage());
            } else {
                initMedalliaDigitalBrainIfNecessary();
                medalliaDigitalBrain.mo28670a(str, mDCallback);
            }
        }
    }
}
