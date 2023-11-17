package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.ExchangePointsData;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.c */
public interface C32944c {

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.c$a */
    public static final class C32945a implements C32944c {

        /* renamed from: a */
        private final Throwable f80818a;

        public C32945a(Throwable th) {
            C41536l.m120489i(th, "error");
            this.f80818a = th;
        }

        /* renamed from: a */
        public final Throwable mo74831a() {
            return this.f80818a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.c$b */
    public static final class C32946b implements C32944c {

        /* renamed from: a */
        private final ExchangePointsData f80819a;

        public C32946b(ExchangePointsData exchangePointsData) {
            C41536l.m120489i(exchangePointsData, "exchangePointsData");
            this.f80819a = exchangePointsData;
        }

        /* renamed from: a */
        public final ExchangePointsData mo74832a() {
            return this.f80819a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C32946b) && C41536l.m120484d(this.f80819a, ((C32946b) obj).f80819a);
        }

        public int hashCode() {
            return this.f80819a.hashCode();
        }

        public String toString() {
            ExchangePointsData exchangePointsData = this.f80819a;
            return "SuccessEvent(exchangePointsData=" + exchangePointsData + ")";
        }
    }
}
