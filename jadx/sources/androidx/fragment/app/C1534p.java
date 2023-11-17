package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p085g0.C6200c;
import p098h0.C6415b;

/* renamed from: androidx.fragment.app.p */
class C1534p implements LayoutInflater.Factory2 {

    /* renamed from: d */
    final FragmentManager f4468d;

    /* renamed from: androidx.fragment.app.p$a */
    class C1535a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        final /* synthetic */ C1480b0 f4469d;

        C1535a(C1480b0 b0Var) {
            this.f4469d = b0Var;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k = this.f4469d.mo4563k();
            this.f4469d.mo4564m();
            C1520l0.m5398n((ViewGroup) k.mView.getParent(), C1534p.this.f4468d).mo4739j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    C1534p(FragmentManager fragmentManager) {
        this.f4468d = fragmentManager;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1480b0 b0Var;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4468d);
        }
        Fragment fragment = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6200c.f19207a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C6200c.f19208b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C6200c.f19209c, -1);
        String string = obtainStyledAttributes.getString(C6200c.f19210d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C1519l.m5391b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            fragment = this.f4468d.mo4415j0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = this.f4468d.mo4418k0(string);
        }
        if (fragment == null && id != -1) {
            fragment = this.f4468d.mo4415j0(id);
        }
        if (fragment == null) {
            fragment = this.f4468d.mo4441w0().mo4458a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mInLayout = true;
            FragmentManager fragmentManager = this.f4468d;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.mo4449z0();
            fragment.onInflate(this.f4468d.mo4449z0().mo4762f(), attributeSet, fragment.mSavedFragmentState);
            b0Var = this.f4468d.mo4414j(fragment);
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            FragmentManager fragmentManager2 = this.f4468d;
            fragment.mFragmentManager = fragmentManager2;
            fragment.mHost = fragmentManager2.mo4449z0();
            fragment.onInflate(this.f4468d.mo4449z0().mo4762f(), attributeSet, fragment.mSavedFragmentState);
            b0Var = this.f4468d.mo4442x(fragment);
            if (FragmentManager.m4954M0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragment + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C6415b.m25484g(fragment, viewGroup);
        fragment.mContainer = viewGroup;
        b0Var.mo4564m();
        b0Var.mo4562j();
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            fragment.mView.addOnAttachStateChangeListener(new C1535a(b0Var));
            return fragment.mView;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
