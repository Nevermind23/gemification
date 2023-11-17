package com.salesforce.marketingcloud.sfmcsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManager;
import com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences;
import com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptionManager;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator;
import com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.storage.StorageManager;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

public final class SFMCSdkComponents {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    private static final String KEY_PREFS_REGISTRATION_ID = "registrationId";
    @Deprecated
    private static final String REGISTRATION_ID_STORAGE = "unified_sdk_registration";
    @Deprecated
    public static final String TAG = "SFMCSdkComponents";
    private final BehaviorManager behaviorManager;
    private final Context context;
    private final EncryptionManager encryptionManager;
    private final EventManager eventManager;
    private final SdkExecutors executors = new SdkExecutors((ExecutorService) null, (ExecutorService) null, 3, (DefaultConstructorMarker) null);
    private final Identity identity;
    private final String moduleApplicationId;
    private final String moduleName;
    private final String registrationId;
    private final StorageManager storageManager;

    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SFMCSdkComponents(Context context2, String str, String str2, BehaviorManager behaviorManager2, EventManager eventManager2) {
        C41536l.m120489i(context2, "context");
        C41536l.m120489i(str, "moduleName");
        C41536l.m120489i(str2, "moduleApplicationId");
        C41536l.m120489i(behaviorManager2, "behaviorManager");
        C41536l.m120489i(eventManager2, "eventManager");
        this.context = context2;
        this.moduleName = str;
        this.moduleApplicationId = str2;
        this.behaviorManager = behaviorManager2;
        this.eventManager = eventManager2;
        EncryptionManager encryptionManager2 = new EncryptionManager(context2, str2);
        this.encryptionManager = encryptionManager2;
        String packageName = context2.getPackageName();
        C41536l.m120488h(packageName, "context.packageName");
        SharedPreferences create = EncryptedSharedPreferences.create(context2, REGISTRATION_ID_STORAGE, new EncryptionManager(context2, packageName).getEncryptionKey$sfmcsdk_release());
        C41536l.m120488h(create, "create(\n        context,…me).encryptionKey\n      )");
        final String string = create.getString(KEY_PREFS_REGISTRATION_ID, (String) null);
        if (string != null) {
            SFMCSdkLogger.INSTANCE.mo31452d(TAG, new C43064a() {
                public final String invoke() {
                    return C41536l.m120497q("StorageManager was initialized with existing install id: ", string);
                }
            });
        } else {
            string = UUID.randomUUID().toString();
            C41536l.m120488h(string, "randomUUID().toString()");
            create.edit().putString(KEY_PREFS_REGISTRATION_ID, string).apply();
            SFMCSdkLogger.INSTANCE.mo31452d(TAG, new C43064a() {
                public final String invoke() {
                    return C41536l.m120497q("StorageManager was initialized with new install id: ", string);
                }
            });
        }
        this.registrationId = string;
        this.storageManager = new StorageManager(context2, encryptionManager2, str2, string);
        this.identity = Identity.Companion.create$sfmcsdk_release(string);
    }

    public static /* synthetic */ NetworkManager createNetworkManager$default(SFMCSdkComponents sFMCSdkComponents, Authenticator authenticator, int i, Object obj) {
        if ((i & 1) != 0) {
            authenticator = null;
        }
        return sFMCSdkComponents.createNetworkManager(authenticator);
    }

    public final NetworkManager createNetworkManager() {
        return createNetworkManager$default(this, (Authenticator) null, 1, (Object) null);
    }

    public final BehaviorManager getBehaviorManager() {
        return this.behaviorManager;
    }

    public final Context getContext$sfmcsdk_release() {
        return this.context;
    }

    public final EncryptionManager getEncryptionManager() {
        return this.encryptionManager;
    }

    public final EventManager getEventManager() {
        return this.eventManager;
    }

    public final SdkExecutors getExecutors() {
        return this.executors;
    }

    public final Identity getIdentity() {
        return this.identity;
    }

    public final String getModuleApplicationId() {
        return this.moduleApplicationId;
    }

    public final String getModuleName$sfmcsdk_release() {
        return this.moduleName;
    }

    public final String getRegistrationId() {
        return this.registrationId;
    }

    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    public final NetworkManager createNetworkManager(Authenticator authenticator) {
        return new NetworkManager(this.context, this.executors, this.storageManager.getSecurePrefs("network_manager"), authenticator);
    }
}
