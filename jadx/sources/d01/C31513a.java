package d01;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32303f;
import g91.C32343x;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26148a;
import m70.C26150c;
import m70.C26153f;
import o70.C26763b;
import o70.C26765d;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productcards.AccountCardView;
import p341ge.bog.designsystem.components.productcards.CreditCardView;
import p341ge.bog.designsystem.components.productcards.basecard.C13473a;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.products.domain.model.BillInfo;
import p341ge.bog.mobilebank.products.domain.model.CreditCardAccount;
import p366bk.C10328q;
import p793iw.C25263b;

/* renamed from: d01.a */
public abstract class C31513a {
    /* renamed from: a */
    public static final String m93587a(C25263b bVar, Context context) {
        String g;
        String str;
        C41536l.m120489i(bVar, "transaction");
        C41536l.m120489i(context, "context");
        if (bVar.mo63822g() == null) {
            return "";
        }
        if ((bVar.mo63821f() == null && bVar.mo63825i() == null) || (g = bVar.mo63822g()) == null) {
            return "";
        }
        int hashCode = g.hashCode();
        if (hashCode != 2012639) {
            if (hashCode != 2459034) {
                if (hashCode != 807116442 || !g.equals(ProductType.BONUS_PROD_TYPE_CASHBACK)) {
                    return "";
                }
                str = "+ " + C32303f.m95203n(bVar.mo63825i(), "GEL");
            } else if (!g.equals("PLUS")) {
                return "";
            } else {
                str = "+ " + C32359z0.m95531B(bVar.mo63821f()) + " " + context.getString(C10328q.payments_plus_points);
            }
        } else if (!g.equals("AMEX")) {
            return "";
        } else {
            str = "+ " + C32359z0.m95531B(bVar.mo63821f()) + " MR " + context.getString(C10328q.common_text_point);
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.util.List m93588b(java.util.List r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r6.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x0078
            boolean r1 = r6 instanceof java.util.Collection
            r3 = 0
            if (r1 == 0) goto L_0x001a
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x001a
        L_0x0018:
            r1 = r3
            goto L_0x0031
        L_0x001a:
            java.util.Iterator r1 = r6.iterator()
        L_0x001e:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0018
            java.lang.Object r4 = r1.next()
            o70.d r4 = (o70.C26765d) r4
            boolean r4 = r4.mo66014S()
            if (r4 == 0) goto L_0x001e
            r1 = r2
        L_0x0031:
            if (r1 == 0) goto L_0x0038
            xh.a r1 = p669xh.C18763a.DIGITAL_CARD
            r0.add(r1)
        L_0x0038:
            java.util.Iterator r6 = r6.iterator()
        L_0x003c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0078
            java.lang.Object r1 = r6.next()
            o70.d r1 = (o70.C26765d) r1
            java.lang.String r1 = r1.mo66022d()
            xh.a r1 = o31.C37603j.m110584g(r1)
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0058
        L_0x0056:
            r4 = r2
            goto L_0x0070
        L_0x0058:
            java.util.Iterator r4 = r0.iterator()
        L_0x005c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r4.next()
            xh.a r5 = (p669xh.C18763a) r5
            if (r5 != r1) goto L_0x006c
            r5 = r2
            goto L_0x006d
        L_0x006c:
            r5 = r3
        L_0x006d:
            if (r5 == 0) goto L_0x005c
            r4 = r3
        L_0x0070:
            if (r4 == 0) goto L_0x003c
            if (r1 == 0) goto L_0x003c
            r0.add(r1)
            goto L_0x003c
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d01.C31513a.m93588b(java.util.List):java.util.List");
    }

    /* renamed from: c */
    public static final AccountCardView.C13445a m93589c(C26148a aVar, List list, C26150c cVar) {
        boolean z;
        String str;
        Object obj;
        C26763b bVar;
        String str2;
        String str3;
        Image.Url url;
        boolean z2;
        C13473a.C13476b bVar2;
        Object obj2;
        double d;
        boolean z3;
        C41536l.m120489i(aVar, "account");
        C41536l.m120489i(list, "cardItems");
        String c = aVar.mo65088c();
        boolean z4 = false;
        if (c == null || c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = aVar.mo65088c();
            C41536l.m120486f(str);
        } else {
            str = C32343x.m95388F(aVar.mo65113y(), new Object[0]);
        }
        String str4 = str;
        ArrayList arrayList = new ArrayList();
        List b = m93588b(list);
        if (cVar != null && cVar.mo65138q().size() > 1) {
            List<C26153f> q = cVar.mo65138q();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(q, 10));
            for (C26153f fVar : q) {
                String c2 = fVar.mo65167c();
                BigDecimal h = fVar.mo65173h();
                if (h != null) {
                    d = h.doubleValue();
                } else {
                    d = 0.0d;
                }
                if (d > Utils.DOUBLE_EPSILON) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList2.add(new AccountCardView.C13446b(c2, z3));
            }
            arrayList.addAll(arrayList2);
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26765d) obj).mo66013R()) {
                break;
            }
        }
        C26765d dVar = (C26765d) obj;
        if (dVar == null || (bVar = dVar.mo66043v()) == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((C26765d) obj2).mo66017V()) {
                    break;
                }
            }
            C26765d dVar2 = (C26765d) obj2;
            if (dVar2 != null) {
                bVar = dVar2.mo66043v();
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            str2 = bVar.mo65986c();
        } else {
            str2 = null;
        }
        String c3 = C32289b0.m95091c(str2);
        if (bVar != null) {
            str3 = bVar.mo65986c();
        } else {
            str3 = null;
        }
        if (str3 != null) {
            C41536l.m120488h(c3, "imageUrl");
            url = new Image.Url(c3, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        } else {
            url = null;
        }
        Amount amount = new Amount(aVar.mo65093g().doubleValue(), aVar.mo65094h());
        if (cVar == null || !cVar.mo65140s()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (url == null) {
            bVar2 = C13473a.C13476b.CLEAR;
        } else {
            if (bVar != null && bVar.mo65987d()) {
                z4 = true;
            }
            if (z4) {
                bVar2 = C13473a.C13476b.BLACK;
            } else {
                bVar2 = C13473a.C13476b.WHITE;
            }
        }
        return new AccountCardView.C13445a(str4, amount, url, (Image) null, z2, bVar2, b, (List) null, arrayList, false, false, 1672, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static final CreditCardView.C13448a m93590d(CreditCardAccount creditCardAccount, BillInfo billInfo, String str, String str2, List list) {
        Long l;
        double d;
        boolean z;
        Object obj;
        C26763b bVar;
        String str3;
        String str4;
        Image.Url url;
        boolean z2;
        String str5;
        C13473a.C13476b bVar2;
        CreditCardView.C13449b.C13450a aVar;
        CreditCardView.C13449b.C13451b bVar3;
        Object obj2;
        String str6 = str;
        String str7 = str2;
        C41536l.m120489i(creditCardAccount, "creditCardAccount");
        C41536l.m120489i(str6, "spentLabel");
        C41536l.m120489i(str7, "dueDateLabel");
        C41536l.m120489i(list, "cardItems");
        List b = m93588b(list);
        if (billInfo != null) {
            l = billInfo.mo81913g();
        } else {
            l = null;
        }
        if (billInfo != null) {
            d = billInfo.mo81921p();
        } else {
            d = 0.0d;
        }
        boolean z3 = true;
        if (d > Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C26765d) obj).mo66013R()) {
                break;
            }
        }
        C26765d dVar = (C26765d) obj;
        if (dVar == null || (bVar = dVar.mo66043v()) == null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((C26765d) obj2).mo66017V()) {
                    break;
                }
            }
            C26765d dVar2 = (C26765d) obj2;
            if (dVar2 != null) {
                bVar = dVar2.mo66043v();
            } else {
                bVar = null;
            }
        }
        if (bVar != null) {
            str3 = bVar.mo65986c();
        } else {
            str3 = null;
        }
        String c = C32289b0.m95091c(str3);
        if (bVar != null) {
            str4 = bVar.mo65986c();
        } else {
            str4 = null;
        }
        if (str4 != null) {
            C41536l.m120488h(c, "imageUrl");
            url = new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        } else {
            url = null;
        }
        if (creditCardAccount.mo81942b().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str5 = creditCardAccount.mo81942b();
        } else {
            str5 = C32343x.m95388F(creditCardAccount.mo81948g(), new Object[0]);
        }
        Amount amount = new Amount(creditCardAccount.mo81943d(), creditCardAccount.mo81947f());
        if (url == null) {
            bVar2 = C13473a.C13476b.CLEAR;
        } else {
            if (bVar == null || !bVar.mo65987d()) {
                z3 = false;
            }
            if (z3) {
                bVar2 = C13473a.C13476b.BLACK;
            } else {
                bVar2 = C13473a.C13476b.WHITE;
            }
        }
        C13473a.C13476b bVar4 = bVar2;
        if (l == null || billInfo.mo81919l() <= Utils.DOUBLE_EPSILON) {
            aVar = null;
        } else {
            aVar = new CreditCardView.C13449b.C13450a(str7, C32343x.m95410Q(billInfo.mo81919l(), billInfo.mo81908d(), false, 2, (Object) null), new Date(l.longValue()));
        }
        if (z) {
            bVar3 = new CreditCardView.C13449b.C13451b(str6);
        } else {
            bVar3 = null;
        }
        return new CreditCardView.C13448a(str5, amount, url, (Image) null, false, bVar4, b, (List) null, aVar, bVar3, false, 1160, (DefaultConstructorMarker) null);
    }
}
