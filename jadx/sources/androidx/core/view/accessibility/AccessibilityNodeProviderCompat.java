package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat {

    /* renamed from: a */
    private final Object f3770a;

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$a */
    static class C1065a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final AccessibilityNodeProviderCompat f3771a;

        C1065a(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f3771a = accessibilityNodeProviderCompat;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            AccessibilityNodeInfoCompat b = this.f3771a.mo34b(i);
            if (b == null) {
                return null;
            }
            return b.mo3638z0();
        }

        public List findAccessibilityNodeInfosByText(String str, int i) {
            List<AccessibilityNodeInfoCompat> c = this.f3771a.mo3647c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).mo3638z0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3771a.mo36f(i, i2, bundle);
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$b */
    static class C1066b extends C1065a {
        C1066b(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            AccessibilityNodeInfoCompat d = this.f3771a.mo35d(i);
            if (d == null) {
                return null;
            }
            return d.mo3638z0();
        }
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeProviderCompat$c */
    static class C1067c extends C1066b {
        C1067c(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3771a.mo3646a(i, AccessibilityNodeInfoCompat.m3965A0(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3770a = new C1067c(this);
        } else {
            this.f3770a = new C1066b(this);
        }
    }

    /* renamed from: a */
    public void mo3646a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public AccessibilityNodeInfoCompat mo34b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<AccessibilityNodeInfoCompat> mo3647c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public AccessibilityNodeInfoCompat mo35d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object mo3648e() {
        return this.f3770a;
    }

    /* renamed from: f */
    public boolean mo36f(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.f3770a = obj;
    }
}
