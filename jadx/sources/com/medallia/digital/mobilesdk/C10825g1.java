package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.g1 */
class C10825g1 extends C10773d2<CustomParameter> {
    protected C10825g1(C11083s0 s0Var) {
        super(s0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28117a(CustomParameter customParameter) {
        super.mo28117a(customParameter);
        C10735b4.m39109b(String.format(Locale.US, "Collectors > set custom params: %s", new Object[]{customParameter.toString()}));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32175J;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ValueType mo28329g() {
        return ((CustomParameter) mo28863f()).mo27775c() == null ? ValueType.TypeString : ((CustomParameter) mo28863f()).mo27775c() instanceof Integer ? ValueType.TypeInteger : ((CustomParameter) mo28863f()).mo27775c() instanceof Double ? ValueType.TypeDouble : ((CustomParameter) mo28863f()).mo27775c() instanceof Long ? ValueType.TypeLong : ((CustomParameter) mo28863f()).mo27775c() instanceof Boolean ? ValueType.TypeBoolean : ((CustomParameter) mo28863f()).mo27775c() instanceof Float ? ValueType.TypeDouble : ValueType.TypeString;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public ArrayList<CustomParameter> mo28330j() {
        ArrayList<CustomParameter> customParameterArray = ModelFactory.getInstance().getCustomParameterArray(C11089s6.m40668b().mo28981b(C11089s6.C11090a.CUSTOM_PARAMETERS));
        ArrayList<CustomParameter> arrayList = new ArrayList<>();
        if (customParameterArray == null) {
            return arrayList;
        }
        Iterator<CustomParameter> it = customParameterArray.iterator();
        while (it.hasNext()) {
            CustomParameter next = it.next();
            if (!(next == null || next.mo27771a() == null)) {
                arrayList.add(next.mo27780f());
            }
        }
        return arrayList;
    }
}
