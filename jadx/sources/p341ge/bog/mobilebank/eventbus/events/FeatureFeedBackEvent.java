package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.FeatureFeedback;

/* renamed from: ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent */
public final class FeatureFeedBackEvent extends RootEvent {
    private ArrayList<FeatureFeedback> featureFeedbacks = new ArrayList<>();
    private boolean isShown;

    /* renamed from: ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent$Location */
    public enum Location {
        PAYMENTS,
        TRANSFERS,
        HOME_TABS
    }

    /* renamed from: ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent$Location[] r0 = p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent.Location.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent$Location r1 = p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent.Location.PAYMENTS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent$Location r1 = p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent.Location.TRANSFERS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent$Location r1 = p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent.Location.HOME_TABS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent.WhenMappings.<clinit>():void");
        }
    }

    public final ArrayList<FeatureFeedback> getFeatureFeedbacks() {
        return this.featureFeedbacks;
    }

    public final FeatureFeedback getFeedbackId(Location location) {
        C41536l.m120489i(location, "location");
        int i = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
        T t = null;
        if (i == 1) {
            Iterator<T> it = this.featureFeedbacks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((FeatureFeedback) next).shouldShowAfterPayment()) {
                    t = next;
                    break;
                }
            }
            return (FeatureFeedback) t;
        } else if (i == 2) {
            Iterator<T> it2 = this.featureFeedbacks.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (((FeatureFeedback) next2).shouldShowAfterTransfer()) {
                    t = next2;
                    break;
                }
            }
            return (FeatureFeedback) t;
        } else if (i == 3) {
            Iterator<T> it3 = this.featureFeedbacks.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next3 = it3.next();
                if (((FeatureFeedback) next3).shouldShowPFMSurvey()) {
                    t = next3;
                    break;
                }
            }
            return (FeatureFeedback) t;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isShown() {
        return this.isShown;
    }

    public final void setFeatureFeedbacks(ArrayList<FeatureFeedback> arrayList) {
        C41536l.m120489i(arrayList, "<set-?>");
        this.featureFeedbacks = arrayList;
    }

    public final void setShown(boolean z) {
        this.isShown = z;
    }

    public final boolean shouldShowAfter(Location location) {
        C41536l.m120489i(location, "location");
        int i = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
        if (i == 1) {
            ArrayList<FeatureFeedback> arrayList = this.featureFeedbacks;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                for (FeatureFeedback shouldShowAfterPayment : arrayList) {
                    if (shouldShowAfterPayment.shouldShowAfterPayment()) {
                        return true;
                    }
                }
            }
        } else if (i == 2) {
            ArrayList<FeatureFeedback> arrayList2 = this.featureFeedbacks;
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                for (FeatureFeedback shouldShowAfterTransfer : arrayList2) {
                    if (shouldShowAfterTransfer.shouldShowAfterTransfer()) {
                        return true;
                    }
                }
            }
        } else if (i == 3) {
            ArrayList<FeatureFeedback> arrayList3 = this.featureFeedbacks;
            if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                for (FeatureFeedback shouldShowPFMSurvey : arrayList3) {
                    if (shouldShowPFMSurvey.shouldShowPFMSurvey()) {
                        return true;
                    }
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }
}
