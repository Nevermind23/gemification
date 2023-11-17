package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import com.salesforce.marketingcloud.C11302R;
import com.salesforce.marketingcloud.messages.iam.InAppMessage;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.iam.c */
public class C11637c extends Fragment {

    /* renamed from: a */
    private C11654k f33745a;

    /* renamed from: com.salesforce.marketingcloud.messages.iam.c$a */
    class C11638a implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ boolean f33746a;

        C11638a(boolean z) {
            this.f33746a = z;
        }

        public void onAnimationEnd(Animation animation) {
            C1505h activity;
            View view = C11637c.this.getView();
            if (view != null) {
                view.setLayerType(0, (Paint) null);
            }
            if (!this.f33746a && (activity = C11637c.this.getActivity()) != null) {
                activity.finish();
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: a */
    private int m42456a(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? C11302R.layout.mcsdk_iam_banner_top : C11302R.layout.mcsdk_iam_banner_bottom;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f33745a = (C11654k) getArguments().getParcelable("messageHandler");
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        View view;
        Animation onCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (onCreateAnimation == null && i2 != 0) {
            onCreateAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
        }
        if (!(onCreateAnimation == null || (view = getView()) == null)) {
            view.setLayerType(2, (Paint) null);
            onCreateAnimation.setAnimationListener(new C11638a(z));
        }
        return onCreateAnimation;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [androidx.fragment.app.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            com.salesforce.marketingcloud.messages.iam.k r5 = r2.f33745a
            r0 = 0
            if (r5 != 0) goto L_0x0006
            return r0
        L_0x0006:
            com.salesforce.marketingcloud.messages.iam.InAppMessage r5 = r5.mo30716d()
            int r5 = r2.m42456a((com.salesforce.marketingcloud.messages.iam.InAppMessage) r5)
            r1 = 0
            android.view.View r3 = r3.inflate(r5, r4, r1)
            androidx.fragment.app.h r4 = r2.getActivity()
            boolean r4 = r4 instanceof android.view.View.OnClickListener
            if (r4 == 0) goto L_0x0022
            androidx.fragment.app.h r4 = r2.getActivity()
            r0 = r4
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
        L_0x0022:
            com.salesforce.marketingcloud.messages.iam.b r4 = new com.salesforce.marketingcloud.messages.iam.b
            com.salesforce.marketingcloud.messages.iam.k r5 = r2.f33745a
            android.graphics.Typeface r5 = r5.mo30723k()
            r4.<init>(r0, r5)
            com.salesforce.marketingcloud.messages.iam.k r5 = r2.f33745a
            r4.mo30692a((android.view.View) r3, (com.salesforce.marketingcloud.messages.iam.C11654k) r5)
            int r4 = r4.mo30687g()
            android.view.View r4 = r3.findViewById(r4)
            com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout r4 = (com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout) r4
            if (r4 == 0) goto L_0x004f
            androidx.fragment.app.h r5 = r2.getActivity()
            boolean r5 = r5 instanceof com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener
            if (r5 == 0) goto L_0x004f
            androidx.fragment.app.h r5 = r2.getActivity()
            com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout$SwipeDismissListener r5 = (com.salesforce.marketingcloud.messages.iam.SwipeDismissConstraintLayout.SwipeDismissListener) r5
            r4.setListener(r5)
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.messages.iam.C11637c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* renamed from: a */
    public static C11637c m42457a(C11654k kVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("messageHandler", kVar);
        C11637c cVar = new C11637c();
        cVar.setArguments(bundle);
        return cVar;
    }
}
