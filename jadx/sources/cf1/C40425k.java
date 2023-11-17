package cf1;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import ze1.C43420e;

/* renamed from: cf1.k */
public abstract class C40425k {
    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C40412h m117025d(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C40415i(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C43420e m117026e(MatchResult matchResult) {
        return C43429k.m124596o(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C43420e m117027f(MatchResult matchResult, int i) {
        return C43429k.m124596o(matchResult.start(i), matchResult.end(i));
    }
}
