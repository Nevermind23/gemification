package p245s4;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p154l4.C6888f;
import p334z4.C9207a;

/* renamed from: s4.c */
abstract class C8224c {

    /* renamed from: a */
    private static final List f23403a = new ArrayList(Arrays.asList(new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class}));

    /* renamed from: a */
    static List m30998a(View view) {
        Class<C8224c> cls = C8224c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Class isInstance : f23403a) {
                if (isInstance.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            for (View a : C6888f.m26738b(view)) {
                arrayList.addAll(m30998a(a));
            }
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    static JSONObject m30999b(View view, View view2) {
        Class<C8224c> cls = C8224c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            m31002e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            for (View b : C6888f.m26738b(view)) {
                jSONArray.put(m30999b(b, view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private static List m31000c(View view) {
        Class<C8224c> cls = C8224c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : C6888f.m26738b(view)) {
                String k = C6888f.m26747k(view2);
                if (!k.isEmpty()) {
                    arrayList.add(k);
                }
                arrayList.addAll(m31000c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static String m31001d(View view) {
        Class<C8224c> cls = C8224c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            String k = C6888f.m26747k(view);
            if (!k.isEmpty()) {
                return k;
            }
            return TextUtils.join(" ", m31000c(view));
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    static void m31002e(View view, JSONObject jSONObject) {
        Class<C8224c> cls = C8224c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                String k = C6888f.m26747k(view);
                String i = C6888f.m26745i(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", C6888f.m26739c(view));
                if (!k.isEmpty()) {
                    jSONObject.put("text", k);
                }
                if (!i.isEmpty()) {
                    jSONObject.put("hint", i);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }
}
