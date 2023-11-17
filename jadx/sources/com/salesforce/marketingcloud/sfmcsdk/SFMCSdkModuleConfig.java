package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.cdp.CdpModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleConfig;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

public final class SFMCSdkModuleConfig {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CdpModuleConfig cdpModuleConfig;
    private List<? extends Config> configs;
    private final PushModuleConfig pushModuleConfig;

    public static final class Builder {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        private static final String TAG = "~$SFMCSdkModuleConfig.Builder";
        private CdpModuleConfig cdpModuleConfig;
        private PushModuleConfig pushModuleConfig;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final SFMCSdkModuleConfig build() {
            return new SFMCSdkModuleConfig(this, (DefaultConstructorMarker) null);
        }

        public final CdpModuleConfig getCdpModuleConfig() {
            return this.cdpModuleConfig;
        }

        public final PushModuleConfig getPushModuleConfig() {
            return this.pushModuleConfig;
        }

        public final void setCdpModuleConfig(CdpModuleConfig cdpModuleConfig2) {
            boolean z = false;
            if (cdpModuleConfig2 != null && cdpModuleConfig2.isModuleCompatible()) {
                z = true;
            }
            if (!z) {
                SFMCSdkLogger.INSTANCE.mo31463w(TAG, new SFMCSdkModuleConfig$Builder$cdpModuleConfig$1(cdpModuleConfig2));
                cdpModuleConfig2 = null;
            }
            this.cdpModuleConfig = cdpModuleConfig2;
        }

        public final void setPushModuleConfig(PushModuleConfig pushModuleConfig2) {
            boolean z = false;
            if (pushModuleConfig2 != null && pushModuleConfig2.isModuleCompatible()) {
                z = true;
            }
            if (!z) {
                SFMCSdkLogger.INSTANCE.mo31463w(TAG, new SFMCSdkModuleConfig$Builder$pushModuleConfig$1(pushModuleConfig2));
                pushModuleConfig2 = null;
            }
            this.pushModuleConfig = pushModuleConfig2;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SFMCSdkModuleConfig build(C43075l lVar) {
            C41536l.m120489i(lVar, "block");
            Builder builder = new Builder();
            lVar.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ SFMCSdkModuleConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static final SFMCSdkModuleConfig build(C43075l lVar) {
        return Companion.build(lVar);
    }

    public final CdpModuleConfig getCdpModuleConfig() {
        return this.cdpModuleConfig;
    }

    public final List<Config> getConfigs$sfmcsdk_release() {
        return this.configs;
    }

    public final PushModuleConfig getPushModuleConfig() {
        return this.pushModuleConfig;
    }

    public final void setConfigs$sfmcsdk_release(List<? extends Config> list) {
        C41536l.m120489i(list, "<set-?>");
        this.configs = list;
    }

    private SFMCSdkModuleConfig(PushModuleConfig pushModuleConfig2, CdpModuleConfig cdpModuleConfig2) {
        this.pushModuleConfig = pushModuleConfig2;
        this.cdpModuleConfig = cdpModuleConfig2;
        this.configs = C41341q.m119912o(pushModuleConfig2, cdpModuleConfig2);
    }

    private SFMCSdkModuleConfig(Builder builder) {
        this(builder.getPushModuleConfig(), builder.getCdpModuleConfig());
    }
}
