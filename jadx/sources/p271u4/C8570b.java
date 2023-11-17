package p271u4;

import android.content.res.Resources;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p271u4.C8567a;
import p341ge.bog.mobilebank.model.PensionStatusResult;

/* renamed from: u4.b */
public final class C8570b {

    /* renamed from: d */
    private static C8570b f24310d;

    /* renamed from: e */
    private static Method f24311e;

    /* renamed from: a */
    private final C8567a f24312a = new C8567a();

    /* renamed from: b */
    private final C8576f f24313b = new C8576f();

    /* renamed from: c */
    private Method f24314c;

    /* renamed from: u4.b$a */
    private static class C8571a {

        /* renamed from: a */
        private static Field f24315a;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                f24315a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }

        /* renamed from: a */
        private static JSONObject m32056a(View view) {
            try {
                if (f24315a == null) {
                    Field declaredField = View.class.getDeclaredField("mKeyedTags");
                    f24315a = declaredField;
                    declaredField.setAccessible(true);
                }
                SparseArray sparseArray = (SparseArray) f24315a.get(view);
                if (sparseArray == null || sparseArray.size() <= 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    int size = sparseArray.size();
                    for (int i = 0; i < size; i++) {
                        try {
                            jSONObject.put(C8575e.m32063c(view.getContext(), view.getResources(), sparseArray.keyAt(i)), sparseArray.valueAt(i));
                        } catch (JSONException unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                return jSONObject;
            } catch (Exception unused3) {
                return null;
            }
        }

        /* renamed from: b */
        static void m32057b(PrintWriter printWriter, View view) {
            AccessibilityNodeInfo a = C8570b.m32042c(view);
            if (a != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (view instanceof TextView) {
                        TextView textView = (TextView) view;
                        jSONObject.put("textColor", textView.getTextColors().getDefaultColor());
                        jSONObject.put("textSize", (double) textView.getTextSize());
                        jSONObject.put("hint", C8570b.m32045f(textView.getHint(), 100));
                    }
                    JSONObject a2 = m32056a(view);
                    if (a2 != null) {
                        jSONObject.put("keyedTags", a2);
                    }
                    JSONArray jSONArray = new JSONArray();
                    for (AccessibilityNodeInfo.AccessibilityAction label : a.getActionList()) {
                        String str = (String) label.getLabel();
                        if (str != null) {
                            jSONArray.put(C8570b.m32045f(str, 50));
                        }
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("actions", jSONArray);
                    }
                    String b = C8570b.m32045f(a.getContentDescription(), 50);
                    if (b != null && b.length() > 0) {
                        jSONObject.put("content-description", b);
                    }
                    jSONObject.put("accessibility-focused", a.isAccessibilityFocused()).put("checkable", a.isCheckable()).put("checked", a.isChecked()).put("class-name", C8570b.m32045f(a.getClassName(), 50)).put("clickable", a.isClickable()).put("content-invalid", a.isContentInvalid()).put("dismissable", a.isDismissable()).put("editable", a.isEditable()).put("enabled", a.isEnabled()).put("focusable", a.isFocusable()).put("focused", a.isFocused()).put("long-clickable", a.isLongClickable()).put("multiline", a.isMultiLine()).put("password", a.isPassword()).put("scrollable", a.isScrollable()).put("selected", a.isSelected()).put("visible-to-user", a.isVisibleToUser());
                    if (Build.VERSION.SDK_INT >= 24) {
                        C8572b.m32058a(jSONObject, a);
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", C8570b.m32045f(e.getMessage(), 50));
                    } catch (JSONException unused) {
                    }
                }
                printWriter.append(" props=\"").append(jSONObject.toString()).append("\"");
            }
        }
    }

    /* renamed from: u4.b$b */
    private static class C8572b {
        /* renamed from: a */
        static void m32058a(JSONObject jSONObject, AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT >= 24) {
                jSONObject.put("context-clickable", accessibilityNodeInfo.isContextClickable()).put("drawing-order", accessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfo.isImportantForAccessibility());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static AccessibilityNodeInfo m32042c(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        try {
            view.onInitializeAccessibilityNodeInfo(obtain);
            return obtain;
        } catch (NullPointerException unused) {
            if (obtain != null) {
                obtain.recycle();
            }
            return null;
        }
    }

    /* renamed from: d */
    private void m32043d(String str, PrintWriter printWriter, View view, int i, int i2, boolean z, boolean z2) {
        ViewGroup viewGroup;
        int childCount;
        String str2 = str;
        PrintWriter printWriter2 = printWriter;
        View view2 = view;
        boolean z3 = z2;
        printWriter2.print(str2);
        if (view2 == null) {
            printWriter2.println("null");
            return;
        }
        printWriter2.print(view.getClass().getName());
        printWriter2.print("{");
        printWriter2.print(Integer.toHexString(view.hashCode()));
        m32053n(printWriter, view);
        m32052m(printWriter, view, i, i2);
        m32054o(printWriter, view);
        m32055p(printWriter, view);
        if (z3) {
            C8571a.m32057b(printWriter, view);
        }
        printWriter2.println("}");
        if (m32048i(view)) {
            m32051l(printWriter2, view2, str2, z3);
        }
        if (z && (view2 instanceof WebView)) {
            this.f24313b.mo23918d((WebView) view2);
        }
        if ((view2 instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str3 = str2 + "  ";
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            for (int i3 = 0; i3 < childCount; i3++) {
                m32043d(str3, printWriter, (viewGroup = (ViewGroup) view2).getChildAt(i3), iArr[0], iArr[1], z, z2);
            }
        }
    }

    /* renamed from: e */
    private void m32044e(String str, PrintWriter printWriter, String[] strArr) {
        String str2 = str;
        PrintWriter printWriter2 = printWriter;
        String[] strArr2 = strArr;
        printWriter2.print(str2);
        printWriter2.println("Top Level Window View Hierarchy:");
        boolean h = m32047h(strArr2, "all-roots");
        boolean h2 = m32047h(strArr2, "top-root");
        boolean h3 = m32047h(strArr2, "webview");
        boolean h4 = m32047h(strArr2, "props");
        try {
            List b = this.f24312a.mo23916b();
            if (b == null) {
                return;
            }
            if (!b.isEmpty()) {
                Collections.reverse(b);
                Iterator it = b.iterator();
                WindowManager.LayoutParams layoutParams = null;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8567a.C8569b bVar = (C8567a.C8569b) it.next();
                    if (bVar.f24308a.getVisibility() == 0) {
                        if (!h && layoutParams != null && Math.abs(bVar.f24309b.type - layoutParams.type) != 1) {
                            break;
                        }
                        m32043d(str2 + "  ", printWriter, bVar.f24308a, 0, 0, h3, h4);
                        layoutParams = bVar.f24309b;
                        if (h2) {
                            break;
                        }
                        str2 = str;
                    }
                }
                this.f24313b.mo23917b(printWriter2);
            }
        } catch (Exception e) {
            printWriter2.println("Failure in view hierarchy dump: " + e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m32045f(CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() < 1) {
            return "";
        }
        String replace = charSequence.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        if (charSequence.length() <= i) {
            return replace;
        }
        return replace.substring(0, i) + "...";
    }

    /* renamed from: g */
    private static String m32046g(View view) {
        if (f24311e == null) {
            f24311e = view.getClass().getDeclaredMethod("getText", new Class[0]);
        }
        Object invoke = f24311e.invoke(view, new Object[0]);
        if (invoke != null) {
            return invoke.toString();
        }
        return null;
    }

    /* renamed from: h */
    private static boolean m32047h(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String equalsIgnoreCase : strArr) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m32048i(View view) {
        for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (cls.getName().equals("com.facebook.litho.LithoView")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m32049j(String str, PrintWriter printWriter, String[] strArr) {
        if (strArr == null || strArr.length <= 0 || !"e2e".equals(strArr[0])) {
            return false;
        }
        if (f24310d == null) {
            f24310d = new C8570b();
        }
        f24310d.m32044e(str, printWriter, strArr);
        return true;
    }

    /* renamed from: k */
    private static void m32050k(PrintWriter printWriter, View view) {
        Object tag = view.getTag();
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(m32045f(str, 60));
            }
        }
    }

    /* renamed from: l */
    private void m32051l(PrintWriter printWriter, View view, String str, boolean z) {
        try {
            if (this.f24314c == null) {
                this.f24314c = Class.forName("com.facebook.litho.LithoViewTestHelper").getDeclaredMethod("viewToStringForE2E", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            }
            printWriter.append((String) this.f24314c.invoke((Object) null, new Object[]{view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z)}));
        } catch (Exception e) {
            printWriter.append(str).append("Failed litho view sub hierarch dump: ").append(m32045f(e.getMessage(), 100)).println();
        }
    }

    /* renamed from: m */
    private static void m32052m(PrintWriter printWriter, View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        printWriter.print(" ");
        printWriter.print(iArr[0] - i);
        printWriter.print(",");
        printWriter.print(iArr[1] - i2);
        printWriter.print("-");
        printWriter.print((iArr[0] + view.getWidth()) - i);
        printWriter.print(",");
        printWriter.print((iArr[1] + view.getHeight()) - i2);
    }

    /* renamed from: n */
    private static void m32053n(PrintWriter printWriter, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        printWriter.print(" ");
        int visibility = view.getVisibility();
        String str8 = "V";
        String str9 = ".";
        if (visibility == 0) {
            printWriter.print(str8);
        } else if (visibility == 4) {
            printWriter.print(PensionStatusResult.STATUS_INACTIVE);
        } else if (visibility != 8) {
            printWriter.print(str9);
        } else {
            printWriter.print("G");
        }
        String str10 = "F";
        if (view.isFocusable()) {
            str = str10;
        } else {
            str = str9;
        }
        printWriter.print(str);
        if (view.isEnabled()) {
            str2 = "E";
        } else {
            str2 = str9;
        }
        printWriter.print(str2);
        printWriter.print(str9);
        String str11 = "H";
        if (view.isHorizontalScrollBarEnabled()) {
            str3 = str11;
        } else {
            str3 = str9;
        }
        printWriter.print(str3);
        if (!view.isVerticalScrollBarEnabled()) {
            str8 = str9;
        }
        printWriter.print(str8);
        if (view.isClickable()) {
            str4 = "C";
        } else {
            str4 = str9;
        }
        printWriter.print(str4);
        if (view.isLongClickable()) {
            str5 = "L";
        } else {
            str5 = str9;
        }
        printWriter.print(str5);
        printWriter.print(" ");
        if (!view.isFocused()) {
            str10 = str9;
        }
        printWriter.print(str10);
        if (view.isSelected()) {
            str6 = "S";
        } else {
            str6 = str9;
        }
        printWriter.print(str6);
        if (!view.isHovered()) {
            str11 = str9;
        }
        printWriter.print(str11);
        if (view.isActivated()) {
            str7 = PensionStatusResult.STATUS_ACTIVE;
        } else {
            str7 = str9;
        }
        printWriter.print(str7);
        if (view.isDirty()) {
            str9 = "D";
        }
        printWriter.print(str9);
    }

    /* renamed from: o */
    private static void m32054o(PrintWriter printWriter, View view) {
        String str;
        try {
            int id = view.getId();
            if (id == -1) {
                m32050k(printWriter, view);
                return;
            }
            printWriter.append(" #");
            printWriter.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id > 0) {
                if (resources != null) {
                    int i = -16777216 & id;
                    if (i == 16777216) {
                        str = "android";
                    } else if (i != 2130706432) {
                        str = resources.getResourcePackageName(id);
                    } else {
                        str = "app";
                    }
                    printWriter.print(" ");
                    printWriter.print(str);
                    printWriter.print(":");
                    printWriter.print(resources.getResourceTypeName(id));
                    printWriter.print(C11110u2.f31950c);
                    printWriter.print(resources.getResourceEntryName(id));
                    return;
                }
            }
            m32050k(printWriter, view);
        } catch (Exception unused) {
            m32050k(printWriter, view);
        }
    }

    /* renamed from: p */
    private static void m32055p(PrintWriter printWriter, View view) {
        String str;
        String str2;
        Object tag;
        try {
            if (view instanceof TextView) {
                str = ((TextView) view).getText().toString();
            } else if (view.getClass().getSimpleName().equals("RCTextView")) {
                str = m32046g(view);
            } else {
                CharSequence contentDescription = view.getContentDescription();
                if (contentDescription != null) {
                    str2 = contentDescription.toString();
                } else {
                    str2 = null;
                }
                if ((str2 == null || str2.isEmpty()) && (tag = view.getTag()) != null) {
                    str = tag.toString().trim();
                } else {
                    str = str2;
                }
            }
            if (str == null) {
                return;
            }
            if (!str.isEmpty()) {
                printWriter.print(" text=\"");
                printWriter.print(m32045f(str, 600));
                printWriter.print("\"");
            }
        } catch (Exception unused) {
        }
    }
}
