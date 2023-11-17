package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11209y1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.medallia.digital.mobilesdk.v7 */
class C11155v7<T> extends C11133u7<T> {

    /* renamed from: h */
    private C11209y1.C11213d f32065h;

    /* renamed from: i */
    private ArrayList<C11133u7<T>> f32066i;

    public C11155v7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("conjunction") && !jSONObject.isNull("conjunction")) {
                this.f32065h = C11209y1.C11213d.m41113a(jSONObject.getString("conjunction"));
            }
            if (jSONObject.has("childrenCriteria") && !jSONObject.isNull("childrenCriteria")) {
                this.f32066i = ModelFactory.getInstance().getTriggerChildesContract(jSONObject.getJSONArray("childrenCriteria"));
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: c */
    private T m40903c(ArrayList<C10802f0> arrayList, ArrayList<C10802f0> arrayList2, ArrayList<C11204x5> arrayList3) {
        long max;
        Iterator<C11133u7<T>> it = this.f32066i.iterator();
        Long l = null;
        while (it.hasNext()) {
            Object a = it.next().mo29048a(arrayList, arrayList2, arrayList3);
            if (a != null) {
                long longValue = ((Long) a).longValue();
                if (l == null) {
                    l = Long.valueOf(longValue);
                }
                if (l != null && this.f32065h == C11209y1.C11213d.MIN) {
                    max = Math.min(l.longValue(), longValue);
                } else if (l != null && this.f32065h == C11209y1.C11213d.MAX) {
                    max = Math.max(l.longValue(), longValue);
                }
                l = Long.valueOf(max);
            }
        }
        if (l == null) {
            return null;
        }
        return mo29046a((Object) l, Long.class);
    }

    /* renamed from: a */
    public T mo29048a(ArrayList<C10802f0> arrayList, ArrayList<C10802f0> arrayList2, ArrayList<C11204x5> arrayList3) {
        C11209y1.C11213d dVar;
        super.mo29048a(arrayList, arrayList2, arrayList3);
        if (this.f32066i == null || (dVar = this.f32065h) == null) {
            return null;
        }
        if (dVar == C11209y1.C11213d.OR || dVar == C11209y1.C11213d.AND) {
            return m40902b(arrayList, arrayList2, arrayList3);
        }
        if (dVar == C11209y1.C11213d.MIN || dVar == C11209y1.C11213d.MAX) {
            return m40903c(arrayList, arrayList2, arrayList3);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C11209y1.C11213d mo29098b() {
        return this.f32065h;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("{\"conjunction\":");
            C11209y1.C11213d dVar = this.f32065h;
            sb.append(C11051p3.m40518c(dVar != null ? dVar.toString() : null));
            sb.append(",\"childrenCriteria\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.f32066i));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    private T m40902b(ArrayList<C10802f0> arrayList, ArrayList<C10802f0> arrayList2, ArrayList<C11204x5> arrayList3) {
        Boolean bool;
        Class<Boolean> cls = Boolean.class;
        if (!this.f32066i.isEmpty()) {
            Iterator<C11133u7<T>> it = this.f32066i.iterator();
            while (true) {
                if (it.hasNext()) {
                    boolean booleanValue = ((Boolean) it.next().mo29048a(arrayList, arrayList2, arrayList3)).booleanValue();
                    C11209y1.C11213d dVar = this.f32065h;
                    if (dVar != C11209y1.C11213d.OR) {
                        if (dVar == C11209y1.C11213d.AND && !booleanValue) {
                            break;
                        }
                    } else if (booleanValue) {
                        break;
                    }
                } else {
                    C11209y1.C11213d dVar2 = this.f32065h;
                    if (dVar2 != C11209y1.C11213d.OR) {
                        if (dVar2 != C11209y1.C11213d.AND) {
                            return null;
                        }
                    }
                }
            }
            bool = Boolean.FALSE;
            return mo29046a((Object) bool, cls);
        }
        bool = Boolean.TRUE;
        return mo29046a((Object) bool, cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<C11133u7<T>> mo29097a() {
        return this.f32066i;
    }
}
