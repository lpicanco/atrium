package ch.tutteli.atrium.translations

import ch.tutteli.atrium.reporting.translating.StringBasedTranslatable

enum class DescriptionPathAssertion(override val value: String) : StringBasedTranslatable {
    EXIST("existieren"),
    DOES_NOT_HAVE_PARENT("hat kein Pfad")
}
