package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.salesforce.marketingcloud.C11398b;
import com.salesforce.marketingcloud.C11419e;
import com.salesforce.marketingcloud.C11530k;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.alarms.C11327b;
import com.salesforce.marketingcloud.analytics.C11358f;
import com.salesforce.marketingcloud.behaviors.C11402a;
import com.salesforce.marketingcloud.behaviors.C11403b;
import com.salesforce.marketingcloud.behaviors.C11404c;
import com.salesforce.marketingcloud.events.C11436f;
import com.salesforce.marketingcloud.internal.C11513l;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.messages.iam.InAppMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.Behavior;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorListener;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorType;
import com.salesforce.marketingcloud.storage.C11800j;
import java.util.Collection;
import java.util.EnumSet;
import org.json.JSONObject;

@SuppressLint({"UnknownNullness"})
@MCKeep
public class InAppMessageComponent implements C11419e, InAppMessageManager, C11650i, C11530k.C11535e, C11436f, C11403b, BehaviorListener {
    static final String EXTRA_MESSAGE_HANDLER = "messageHandler";
    private final C11327b alarmScheduler;
    private final C11358f analyticsListener;
    private final C11404c behaviorManager;
    private final Context context;
    private C11513l executors;
    private C11580o imageHandler;
    private final Handler messageDelayHandler;
    C11658m realInAppMessageComponent;
    private final C11800j storage;
    private final C11530k syncRouteComponent;
    private SFMCSdkComponents uSdkComponents;
    private final UrlHandler urlHandler;

    public InAppMessageComponent(Context context2, C11800j jVar, C11327b bVar, C11530k kVar, C11404c cVar, C11580o oVar, UrlHandler urlHandler2, C11513l lVar, C11358f fVar) {
        this(context2, jVar, bVar, kVar, cVar, oVar, urlHandler2, lVar, fVar, (SFMCSdkComponents) null);
    }

    private void subscribeForBehaviours() {
        SFMCSdkComponents sFMCSdkComponents = this.uSdkComponents;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getBehaviorManager().registerForBehaviors(EnumSet.of(BehaviorType.APPLICATION_FOREGROUNDED, BehaviorType.APPLICATION_BACKGROUNDED), this);
        } else {
            this.behaviorManager.mo29851a(this, EnumSet.of(C11402a.BEHAVIOR_APP_FOREGROUNDED, C11402a.BEHAVIOR_APP_BACKGROUNDED));
        }
    }

    private void unSubscribeForBehaviours() {
        SFMCSdkComponents sFMCSdkComponents = this.uSdkComponents;
        if (sFMCSdkComponents != null) {
            sFMCSdkComponents.getBehaviorManager().unregisterForAllBehaviors(this);
        }
        C11404c cVar = this.behaviorManager;
        if (cVar != null) {
            cVar.mo29850a((C11403b) this);
        }
    }

    public boolean canDisplay(InAppMessage inAppMessage) {
        C11658m mVar = this.realInAppMessageComponent;
        return mVar != null && mVar.canDisplay(inAppMessage);
    }

    public String componentName() {
        return "InAppMessageManager";
    }

    public JSONObject componentState() {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            return mVar.mo30730a();
        }
        return null;
    }

    public void controlChannelInit(int i) {
        if (C11398b.m41709a(i, C11398b.f33143v)) {
            this.syncRouteComponent.mo30104a(C11530k.C11534d.inAppMessages, (C11530k.C11535e) null);
            unSubscribeForBehaviours();
            C11658m mVar = this.realInAppMessageComponent;
            if (mVar != null) {
                mVar.mo30737b(C11398b.m41711c(i, C11398b.f33143v));
                this.realInAppMessageComponent = null;
                return;
            }
            return;
        }
        if (this.realInAppMessageComponent == null) {
            this.realInAppMessageComponent = new C11658m(this.context, this.storage, this.alarmScheduler, this.imageHandler, this.urlHandler, this.executors, this.analyticsListener, this.messageDelayHandler);
        }
        subscribeForBehaviours();
        this.syncRouteComponent.mo30104a(C11530k.C11534d.inAppMessages, (C11530k.C11535e) this);
    }

    public int getStatusBarColor() {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            return mVar.getStatusBarColor();
        }
        return 0;
    }

    public Typeface getTypeface() {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            return mVar.getTypeface();
        }
        return null;
    }

    public void handleMessageFinished(InAppMessage inAppMessage, C11651j jVar) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.handleMessageFinished(inAppMessage, jVar);
        }
    }

    public void handleOutcomes(Collection<String> collection) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.handleOutcomes(collection);
        }
    }

    public C11580o imageHandler() {
        C11658m mVar = this.realInAppMessageComponent;
        return mVar != null ? mVar.imageHandler() : this.imageHandler;
    }

    public void init(InitializationStatus.C11293a aVar, int i) {
        if (C11398b.m41710b(i, C11398b.f33143v)) {
            this.syncRouteComponent.mo30104a(C11530k.C11534d.inAppMessages, (C11530k.C11535e) this);
            this.realInAppMessageComponent = new C11658m(this.context, this.storage, this.alarmScheduler, this.imageHandler, this.urlHandler, this.executors, this.analyticsListener, this.messageDelayHandler);
            subscribeForBehaviours();
        }
    }

    public void onBehavior(C11402a aVar, Bundle bundle) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar == null) {
            return;
        }
        if (aVar == C11402a.BEHAVIOR_APP_FOREGROUNDED) {
            mVar.mo30735b();
        } else if (aVar == C11402a.BEHAVIOR_APP_BACKGROUNDED) {
            mVar.mo30738c();
        }
    }

    public void onSyncReceived(C11530k.C11534d dVar, JSONObject jSONObject) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null && dVar == C11530k.C11534d.inAppMessages) {
            mVar.mo30732a(jSONObject);
        }
    }

    public void setInAppMessageListener(InAppMessageManager.EventListener eventListener) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.setInAppMessageListener(eventListener);
        }
    }

    public void setStatusBarColor(int i) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.setStatusBarColor(i);
        }
    }

    public void setTypeface(Typeface typeface) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.setTypeface(typeface);
        }
    }

    /* access modifiers changed from: package-private */
    public void showMessage(InAppMessage inAppMessage) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.mo30741d(inAppMessage);
        }
    }

    public void tearDown(boolean z) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.mo30737b(false);
            this.realInAppMessageComponent = null;
        }
        C11530k kVar = this.syncRouteComponent;
        if (kVar != null) {
            kVar.mo30104a(C11530k.C11534d.inAppMessages, (C11530k.C11535e) null);
        }
        unSubscribeForBehaviours();
    }

    public UrlHandler urlHandler() {
        C11658m mVar = this.realInAppMessageComponent;
        return mVar != null ? mVar.urlHandler() : this.urlHandler;
    }

    public InAppMessageComponent(Context context2, C11800j jVar, C11327b bVar, C11530k kVar, C11404c cVar, C11580o oVar, UrlHandler urlHandler2, C11513l lVar, C11358f fVar, SFMCSdkComponents sFMCSdkComponents) {
        this.messageDelayHandler = new Handler(Looper.getMainLooper());
        this.context = context2;
        this.storage = jVar;
        this.alarmScheduler = bVar;
        this.syncRouteComponent = kVar;
        this.behaviorManager = cVar;
        this.imageHandler = oVar;
        this.urlHandler = urlHandler2;
        this.analyticsListener = fVar;
        this.executors = lVar;
        this.uSdkComponents = sFMCSdkComponents;
    }

    public void onBehavior(Behavior behavior) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar == null) {
            return;
        }
        if (behavior instanceof Behavior.AppForegrounded) {
            mVar.mo30735b();
        } else if (behavior instanceof Behavior.AppBackgrounded) {
            mVar.mo30738c();
        }
    }

    public void showMessage(String str) {
        C11658m mVar = this.realInAppMessageComponent;
        if (mVar != null) {
            mVar.showMessage(str);
        }
    }

    InAppMessageComponent(C11658m mVar) {
        this((Context) null, (C11800j) null, (C11327b) null, (C11530k) null, (C11404c) null, (C11580o) null, (UrlHandler) null, (C11513l) null, (C11358f) null);
        this.realInAppMessageComponent = mVar;
    }
}
