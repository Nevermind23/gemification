package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.p013v4.media.session.C0125b;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.p016os.C0904b;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.salesforce.marketingcloud.C11398b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p266u.C8435c;

public class AccessibilityNodeInfoCompat {

    /* renamed from: d */
    private static int f3717d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f3718a;

    /* renamed from: b */
    public int f3719b = -1;

    /* renamed from: c */
    private int f3720c = -1;

    public static class AccessibilityActionCompat {

        /* renamed from: A */
        public static final AccessibilityActionCompat f3721A = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: B */
        public static final AccessibilityActionCompat f3722B = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (AccessibilityViewCommand) null, AccessibilityViewCommand.C1072e.class);

        /* renamed from: C */
        public static final AccessibilityActionCompat f3723C = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: D */
        public static final AccessibilityActionCompat f3724D = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: E */
        public static final AccessibilityActionCompat f3725E = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: F */
        public static final AccessibilityActionCompat f3726F = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: G */
        public static final AccessibilityActionCompat f3727G;

        /* renamed from: H */
        public static final AccessibilityActionCompat f3728H;

        /* renamed from: I */
        public static final AccessibilityActionCompat f3729I;

        /* renamed from: J */
        public static final AccessibilityActionCompat f3730J;

        /* renamed from: K */
        public static final AccessibilityActionCompat f3731K = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);

        /* renamed from: L */
        public static final AccessibilityActionCompat f3732L;

        /* renamed from: M */
        public static final AccessibilityActionCompat f3733M;

        /* renamed from: N */
        public static final AccessibilityActionCompat f3734N;

        /* renamed from: O */
        public static final AccessibilityActionCompat f3735O;

        /* renamed from: P */
        public static final AccessibilityActionCompat f3736P;

        /* renamed from: Q */
        public static final AccessibilityActionCompat f3737Q;

        /* renamed from: R */
        public static final AccessibilityActionCompat f3738R;

        /* renamed from: S */
        public static final AccessibilityActionCompat f3739S;

        /* renamed from: T */
        public static final AccessibilityActionCompat f3740T;

        /* renamed from: U */
        public static final AccessibilityActionCompat f3741U;

        /* renamed from: e */
        public static final AccessibilityActionCompat f3742e = new AccessibilityActionCompat(1, (CharSequence) null);

        /* renamed from: f */
        public static final AccessibilityActionCompat f3743f = new AccessibilityActionCompat(2, (CharSequence) null);

        /* renamed from: g */
        public static final AccessibilityActionCompat f3744g = new AccessibilityActionCompat(4, (CharSequence) null);

        /* renamed from: h */
        public static final AccessibilityActionCompat f3745h = new AccessibilityActionCompat(8, (CharSequence) null);

        /* renamed from: i */
        public static final AccessibilityActionCompat f3746i = new AccessibilityActionCompat(16, (CharSequence) null);

        /* renamed from: j */
        public static final AccessibilityActionCompat f3747j = new AccessibilityActionCompat(32, (CharSequence) null);

        /* renamed from: k */
        public static final AccessibilityActionCompat f3748k = new AccessibilityActionCompat(64, (CharSequence) null);

        /* renamed from: l */
        public static final AccessibilityActionCompat f3749l = new AccessibilityActionCompat(128, (CharSequence) null);

        /* renamed from: m */
        public static final AccessibilityActionCompat f3750m;

        /* renamed from: n */
        public static final AccessibilityActionCompat f3751n;

        /* renamed from: o */
        public static final AccessibilityActionCompat f3752o;

        /* renamed from: p */
        public static final AccessibilityActionCompat f3753p;

        /* renamed from: q */
        public static final AccessibilityActionCompat f3754q = new AccessibilityActionCompat(C11398b.f33143v, (CharSequence) null);

        /* renamed from: r */
        public static final AccessibilityActionCompat f3755r = new AccessibilityActionCompat(8192, (CharSequence) null);

        /* renamed from: s */
        public static final AccessibilityActionCompat f3756s = new AccessibilityActionCompat(16384, (CharSequence) null);

        /* renamed from: t */
        public static final AccessibilityActionCompat f3757t = new AccessibilityActionCompat(32768, (CharSequence) null);

        /* renamed from: u */
        public static final AccessibilityActionCompat f3758u = new AccessibilityActionCompat(65536, (CharSequence) null);

        /* renamed from: v */
        public static final AccessibilityActionCompat f3759v = new AccessibilityActionCompat(131072, (CharSequence) null, AccessibilityViewCommand.C1074g.class);

        /* renamed from: w */
        public static final AccessibilityActionCompat f3760w = new AccessibilityActionCompat(262144, (CharSequence) null);

        /* renamed from: x */
        public static final AccessibilityActionCompat f3761x = new AccessibilityActionCompat(524288, (CharSequence) null);

        /* renamed from: y */
        public static final AccessibilityActionCompat f3762y = new AccessibilityActionCompat(1048576, (CharSequence) null);

        /* renamed from: z */
        public static final AccessibilityActionCompat f3763z = new AccessibilityActionCompat(2097152, (CharSequence) null, AccessibilityViewCommand.C1075h.class);

        /* renamed from: a */
        final Object f3764a;

        /* renamed from: b */
        private final int f3765b;

        /* renamed from: c */
        private final Class f3766c;

        /* renamed from: d */
        protected final AccessibilityViewCommand f3767d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
            Class<AccessibilityViewCommand.C1069b> cls = AccessibilityViewCommand.C1069b.class;
            f3750m = new AccessibilityActionCompat((int) C11398b.f33139r, (CharSequence) null, (Class) cls);
            f3751n = new AccessibilityActionCompat((int) C11398b.f33140s, (CharSequence) null, (Class) cls);
            Class<AccessibilityViewCommand.C1070c> cls2 = AccessibilityViewCommand.C1070c.class;
            f3752o = new AccessibilityActionCompat((int) C11398b.f33141t, (CharSequence) null, (Class) cls2);
            f3753p = new AccessibilityActionCompat((int) C11398b.f33142u, (CharSequence) null, (Class) cls2);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction = null;
            }
            f3727G = new AccessibilityActionCompat(accessibilityAction, 16908358, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 29) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction2 = null;
            }
            f3728H = new AccessibilityActionCompat(accessibilityAction2, 16908359, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 29) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction3 = null;
            }
            f3729I = new AccessibilityActionCompat(accessibilityAction3, 16908360, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 29) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction4 = null;
            }
            f3730J = new AccessibilityActionCompat(accessibilityAction4, 16908361, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 24) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction5 = null;
            }
            f3732L = new AccessibilityActionCompat(accessibilityAction5, 16908349, (CharSequence) null, (AccessibilityViewCommand) null, AccessibilityViewCommand.C1073f.class);
            if (i >= 26) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction6 = null;
            }
            f3733M = new AccessibilityActionCompat(accessibilityAction6, 16908354, (CharSequence) null, (AccessibilityViewCommand) null, AccessibilityViewCommand.C1071d.class);
            if (i >= 28) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction7 = null;
            }
            f3734N = new AccessibilityActionCompat(accessibilityAction7, 16908356, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 28) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction8 = null;
            }
            f3735O = new AccessibilityActionCompat(accessibilityAction8, 16908357, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 30) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction9 = null;
            }
            f3736P = new AccessibilityActionCompat(accessibilityAction9, 16908362, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 30) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction10 = null;
            }
            f3737Q = new AccessibilityActionCompat(accessibilityAction10, 16908372, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 32) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction11 = null;
            }
            f3738R = new AccessibilityActionCompat(accessibilityAction11, 16908373, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction12 = null;
            }
            f3739S = new AccessibilityActionCompat(accessibilityAction12, 16908374, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction13 = null;
            }
            f3740T = new AccessibilityActionCompat(accessibilityAction13, 16908375, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
            if (i >= 33) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            f3741U = new AccessibilityActionCompat(accessibilityAction14, 16908376, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        }

        public AccessibilityActionCompat(int i, CharSequence charSequence) {
            this((Object) null, i, charSequence, (AccessibilityViewCommand) null, (Class) null);
        }

        /* renamed from: a */
        public AccessibilityActionCompat mo3639a(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat((Object) null, this.f3765b, charSequence, accessibilityViewCommand, this.f3766c);
        }

        /* renamed from: b */
        public int mo3640b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3764a).getId();
        }

        /* renamed from: c */
        public CharSequence mo3641c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3764a).getLabel();
        }

        /* renamed from: d */
        public boolean mo3642d(View view, Bundle bundle) {
            String str;
            if (this.f3767d == null) {
                return false;
            }
            Class cls = this.f3766c;
            if (cls != null) {
                try {
                    C0125b.m366a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e) {
                    Class cls2 = this.f3766c;
                    if (cls2 == null) {
                        str = "null";
                    } else {
                        str = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + str, e);
                }
            }
            return this.f3767d.mo3654a(view, (AccessibilityViewCommand.C1068a) null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.f3764a;
            if (obj2 == null) {
                if (accessibilityActionCompat.f3764a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(accessibilityActionCompat.f3764a)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.f3764a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String i = AccessibilityNodeInfoCompat.m3974i(this.f3765b);
            if (i.equals("ACTION_UNKNOWN") && mo3641c() != null) {
                i = mo3641c().toString();
            }
            sb.append(i);
            return sb.toString();
        }

        public AccessibilityActionCompat(int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this((Object) null, i, charSequence, accessibilityViewCommand, (Class) null);
        }

        AccessibilityActionCompat(Object obj) {
            this(obj, 0, (CharSequence) null, (AccessibilityViewCommand) null, (Class) null);
        }

        private AccessibilityActionCompat(int i, CharSequence charSequence, Class cls) {
            this((Object) null, i, charSequence, (AccessibilityViewCommand) null, cls);
        }

        AccessibilityActionCompat(Object obj, int i, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class cls) {
            this.f3765b = i;
            this.f3767d = accessibilityViewCommand;
            if (obj == null) {
                this.f3764a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f3764a = obj;
            }
            this.f3766c = cls;
        }
    }

    public static class CollectionInfoCompat {

        /* renamed from: a */
        final Object f3768a;

        CollectionInfoCompat(Object obj) {
            this.f3768a = obj;
        }

        /* renamed from: a */
        public static CollectionInfoCompat m4048a(int i, int i2, boolean z, int i3) {
            return new CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public static class CollectionItemInfoCompat {

        /* renamed from: a */
        final Object f3769a;

        CollectionItemInfoCompat(Object obj) {
            this.f3769a = obj;
        }

        /* renamed from: a */
        public static CollectionItemInfoCompat m4049a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new CollectionItemInfoCompat(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public static class RangeInfoCompat {
    }

    public static final class TouchDelegateInfoCompat {
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityNodeInfoCompat$a */
    private static class C1064a {
        /* renamed from: a */
        public static Bundle m4050a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtras();
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3718a = accessibilityNodeInfo;
    }

    /* renamed from: A0 */
    public static AccessibilityNodeInfoCompat m3965A0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    /* renamed from: L */
    public static AccessibilityNodeInfoCompat m3966L() {
        return m3965A0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: M */
    public static AccessibilityNodeInfoCompat m3967M(View view) {
        return m3965A0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: N */
    public static AccessibilityNodeInfoCompat m3968N(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return m3965A0(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f3718a));
    }

    /* renamed from: R */
    private void m3969R(View view) {
        SparseArray u = m3978u(view);
        if (u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < u.size(); i++) {
                if (((WeakReference) u.valueAt(i)).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                u.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: T */
    private void m3970T(int i, boolean z) {
        Bundle r = mo3624r();
        if (r != null) {
            int i2 = r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: d */
    private void m3971d(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m3972f() {
        C1064a.m4050a(this.f3718a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        C1064a.m4050a(this.f3718a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        C1064a.m4050a(this.f3718a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        C1064a.m4050a(this.f3718a).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g */
    private List m3973g(String str) {
        ArrayList<Integer> integerArrayList = C1064a.m4050a(this.f3718a).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        C1064a.m4050a(this.f3718a).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: i */
    static String m3974i(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case C11398b.f33139r /*256*/:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case C11398b.f33140s /*512*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case C11398b.f33141t /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case C11398b.f33142u /*2048*/:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case C11398b.f33143v /*4096*/:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: k */
    private boolean m3975k(int i) {
        Bundle r = mo3624r();
        if (r != null && (r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public static ClickableSpan[] m3976p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: s */
    private SparseArray m3977s(View view) {
        SparseArray u = m3978u(view);
        if (u != null) {
            return u;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(C8435c.f23910I, sparseArray);
        return sparseArray;
    }

    /* renamed from: u */
    private SparseArray m3978u(View view) {
        return (SparseArray) view.getTag(C8435c.f23910I);
    }

    /* renamed from: y */
    private boolean m3979y() {
        return !m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m3980z(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f3717d;
        f3717d = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean mo3573A() {
        return this.f3718a.isCheckable();
    }

    /* renamed from: B */
    public boolean mo3574B() {
        return this.f3718a.isChecked();
    }

    /* renamed from: C */
    public boolean mo3575C() {
        return this.f3718a.isClickable();
    }

    /* renamed from: D */
    public boolean mo3576D() {
        return this.f3718a.isEnabled();
    }

    /* renamed from: E */
    public boolean mo3577E() {
        return this.f3718a.isFocusable();
    }

    /* renamed from: F */
    public boolean mo3578F() {
        return this.f3718a.isFocused();
    }

    /* renamed from: G */
    public boolean mo3579G() {
        return this.f3718a.isLongClickable();
    }

    /* renamed from: H */
    public boolean mo3580H() {
        return this.f3718a.isPassword();
    }

    /* renamed from: I */
    public boolean mo3581I() {
        return this.f3718a.isScrollable();
    }

    /* renamed from: J */
    public boolean mo3582J() {
        return this.f3718a.isSelected();
    }

    /* renamed from: K */
    public boolean mo3583K() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3718a.isShowingHintText();
        }
        return m3975k(4);
    }

    /* renamed from: O */
    public boolean mo3584O(int i, Bundle bundle) {
        return this.f3718a.performAction(i, bundle);
    }

    @Deprecated
    /* renamed from: P */
    public void mo3585P() {
    }

    /* renamed from: Q */
    public boolean mo3586Q(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f3718a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f3764a);
    }

    /* renamed from: S */
    public void mo3587S(boolean z) {
        this.f3718a.setAccessibilityFocused(z);
    }

    @Deprecated
    /* renamed from: U */
    public void mo3588U(Rect rect) {
        this.f3718a.setBoundsInParent(rect);
    }

    /* renamed from: V */
    public void mo3589V(Rect rect) {
        this.f3718a.setBoundsInScreen(rect);
    }

    /* renamed from: W */
    public void mo3590W(boolean z) {
        this.f3718a.setCheckable(z);
    }

    /* renamed from: X */
    public void mo3591X(boolean z) {
        this.f3718a.setChecked(z);
    }

    /* renamed from: Y */
    public void mo3592Y(CharSequence charSequence) {
        this.f3718a.setClassName(charSequence);
    }

    /* renamed from: Z */
    public void mo3593Z(boolean z) {
        this.f3718a.setClickable(z);
    }

    /* renamed from: a */
    public void mo3594a(int i) {
        this.f3718a.addAction(i);
    }

    /* renamed from: a0 */
    public void mo3595a0(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3718a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((CollectionInfoCompat) obj).f3768a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    /* renamed from: b */
    public void mo3596b(AccessibilityActionCompat accessibilityActionCompat) {
        this.f3718a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f3764a);
    }

    /* renamed from: b0 */
    public void mo3597b0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3718a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((CollectionItemInfoCompat) obj).f3769a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: c */
    public void mo3598c(View view, int i) {
        this.f3718a.addChild(view, i);
    }

    /* renamed from: c0 */
    public void mo3599c0(CharSequence charSequence) {
        this.f3718a.setContentDescription(charSequence);
    }

    /* renamed from: d0 */
    public void mo3600d0(boolean z) {
        this.f3718a.setDismissable(z);
    }

    /* renamed from: e */
    public void mo3601e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m3972f();
            m3969R(view);
            ClickableSpan[] p = m3976p(charSequence);
            if (p != null && p.length > 0) {
                mo3624r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C8435c.f23921a);
                SparseArray s = m3977s(view);
                for (int i = 0; i < p.length; i++) {
                    int z = m3980z(p[i], s);
                    s.put(z, new WeakReference(p[i]));
                    m3971d(p[i], (Spanned) charSequence, z);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void mo3602e0(boolean z) {
        this.f3718a.setEnabled(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3718a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f3718a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f3718a)) {
            return false;
        }
        if (this.f3720c == accessibilityNodeInfoCompat.f3720c && this.f3719b == accessibilityNodeInfoCompat.f3719b) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public void mo3604f0(CharSequence charSequence) {
        this.f3718a.setError(charSequence);
    }

    /* renamed from: g0 */
    public void mo3605g0(boolean z) {
        this.f3718a.setFocusable(z);
    }

    /* renamed from: h */
    public List<AccessibilityActionCompat> mo3606h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3718a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public void mo3607h0(boolean z) {
        this.f3718a.setFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3718a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void mo3609i0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3718a.setHeading(z);
        } else {
            m3970T(2, z);
        }
    }

    @Deprecated
    /* renamed from: j */
    public int mo3610j() {
        return this.f3718a.getActions();
    }

    /* renamed from: j0 */
    public void mo3611j0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3718a.setHintText(charSequence);
        } else {
            C1064a.m4050a(this.f3718a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: k0 */
    public void mo3612k0(View view) {
        this.f3718a.setLabelFor(view);
    }

    @Deprecated
    /* renamed from: l */
    public void mo3613l(Rect rect) {
        this.f3718a.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void mo3614l0(int i) {
        this.f3718a.setMaxTextLength(i);
    }

    /* renamed from: m */
    public void mo3615m(Rect rect) {
        this.f3718a.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void mo3616m0(CharSequence charSequence) {
        this.f3718a.setPackageName(charSequence);
    }

    /* renamed from: n */
    public int mo3617n() {
        return this.f3718a.getChildCount();
    }

    /* renamed from: n0 */
    public void mo3618n0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3718a.setPaneTitle(charSequence);
        } else {
            C1064a.m4050a(this.f3718a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: o */
    public CharSequence mo3619o() {
        return this.f3718a.getClassName();
    }

    /* renamed from: o0 */
    public void mo3620o0(View view) {
        this.f3719b = -1;
        this.f3718a.setParent(view);
    }

    /* renamed from: p0 */
    public void mo3621p0(View view, int i) {
        this.f3719b = i;
        this.f3718a.setParent(view, i);
    }

    /* renamed from: q */
    public CharSequence mo3622q() {
        return this.f3718a.getContentDescription();
    }

    /* renamed from: q0 */
    public void mo3623q0(CharSequence charSequence) {
        C1064a.m4050a(this.f3718a).putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* renamed from: r */
    public Bundle mo3624r() {
        return C1064a.m4050a(this.f3718a);
    }

    /* renamed from: r0 */
    public void mo3625r0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3718a.setScreenReaderFocusable(z);
        } else {
            m3970T(1, z);
        }
    }

    /* renamed from: s0 */
    public void mo3626s0(boolean z) {
        this.f3718a.setScrollable(z);
    }

    /* renamed from: t */
    public CharSequence mo3627t() {
        return this.f3718a.getPackageName();
    }

    /* renamed from: t0 */
    public void mo3628t0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3718a.setShowingHintText(z);
        } else {
            m3970T(4, z);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo3613l(rect);
        sb.append("; boundsInParent: " + rect);
        mo3615m(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo3627t());
        sb.append("; className: ");
        sb.append(mo3619o());
        sb.append("; text: ");
        sb.append(mo3631v());
        sb.append("; contentDescription: ");
        sb.append(mo3622q());
        sb.append("; viewId: ");
        sb.append(mo3635x());
        sb.append("; uniqueId: ");
        sb.append(mo3633w());
        sb.append("; checkable: ");
        sb.append(mo3573A());
        sb.append("; checked: ");
        sb.append(mo3574B());
        sb.append("; focusable: ");
        sb.append(mo3577E());
        sb.append("; focused: ");
        sb.append(mo3578F());
        sb.append("; selected: ");
        sb.append(mo3582J());
        sb.append("; clickable: ");
        sb.append(mo3575C());
        sb.append("; longClickable: ");
        sb.append(mo3579G());
        sb.append("; enabled: ");
        sb.append(mo3576D());
        sb.append("; password: ");
        sb.append(mo3580H());
        sb.append("; scrollable: " + mo3581I());
        sb.append("; [");
        List<AccessibilityActionCompat> h = mo3606h();
        for (int i = 0; i < h.size(); i++) {
            AccessibilityActionCompat accessibilityActionCompat = h.get(i);
            String i2 = m3974i(accessibilityActionCompat.mo3640b());
            if (i2.equals("ACTION_UNKNOWN") && accessibilityActionCompat.mo3641c() != null) {
                i2 = accessibilityActionCompat.mo3641c().toString();
            }
            sb.append(i2);
            if (i != h.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u0 */
    public void mo3630u0(View view, int i) {
        this.f3720c = i;
        this.f3718a.setSource(view, i);
    }

    /* renamed from: v */
    public CharSequence mo3631v() {
        if (!m3979y()) {
            return this.f3718a.getText();
        }
        List g = m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g2 = m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g3 = m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g4 = m3973g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3718a.getText(), 0, this.f3718a.getText().length()));
        for (int i = 0; i < g.size(); i++) {
            spannableString.setSpan(new C1077a(((Integer) g4.get(i)).intValue(), this, mo3624r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g.get(i)).intValue(), ((Integer) g2.get(i)).intValue(), ((Integer) g3.get(i)).intValue());
        }
        return spannableString;
    }

    /* renamed from: v0 */
    public void mo3632v0(CharSequence charSequence) {
        if (C0904b.m3330b()) {
            this.f3718a.setStateDescription(charSequence);
        } else {
            C1064a.m4050a(this.f3718a).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: w */
    public String mo3633w() {
        if (C0904b.m3331c()) {
            return this.f3718a.getUniqueId();
        }
        return C1064a.m4050a(this.f3718a).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: w0 */
    public void mo3634w0(CharSequence charSequence) {
        this.f3718a.setText(charSequence);
    }

    /* renamed from: x */
    public String mo3635x() {
        return this.f3718a.getViewIdResourceName();
    }

    /* renamed from: x0 */
    public void mo3636x0(View view) {
        this.f3718a.setTraversalAfter(view);
    }

    /* renamed from: y0 */
    public void mo3637y0(boolean z) {
        this.f3718a.setVisibleToUser(z);
    }

    /* renamed from: z0 */
    public AccessibilityNodeInfo mo3638z0() {
        return this.f3718a;
    }
}
