package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$getClientUserName$1$1 */
final class MoreFragment$getClientUserName$1$1 extends C41537m implements C43075l {
    public static final MoreFragment$getClientUserName$1$1 INSTANCE = new MoreFragment$getClientUserName$1$1();

    MoreFragment$getClientUserName$1$1() {
        super(1);
    }

    public final CharSequence invoke(String str) {
        C41536l.m120489i(str, "it");
        if (!(str.length() > 0)) {
            return str;
        }
        char upperCase = Character.toUpperCase(str.charAt(0));
        String substring = str.substring(1);
        C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }
}
