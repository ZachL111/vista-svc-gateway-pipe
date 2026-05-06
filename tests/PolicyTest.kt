fun main() {
    val signalcase_1 = Signal(77, 97, 19, 12, 11)
    check(Policy.score(signalcase_1) == 170)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(95, 75, 27, 10, 11)
    check(Policy.score(signalcase_2) == 162)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(103, 102, 14, 18, 6)
    check(Policy.score(signalcase_3) == 192)
    check(Policy.classify(signalcase_3) == "accept")
    val domainReview = DomainReview(53, 25, 15, 57)
    check(DomainReviewLens.score(domainReview) == 143)
    check(DomainReviewLens.lane(domainReview) == "ship")
}
