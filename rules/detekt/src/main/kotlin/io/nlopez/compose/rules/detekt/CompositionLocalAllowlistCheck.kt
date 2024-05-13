// Copyright 2023 Nacho Lopez
// SPDX-License-Identifier: Apache-2.0
package io.nlopez.compose.rules.detekt

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Severity
import io.nlopez.compose.core.ComposeKtVisitor
import io.nlopez.compose.rules.CompositionLocalAllowlist
import io.nlopez.compose.rules.DetektRule

class CompositionLocalAllowlistCheck(config: Config) :
    DetektRule(config),
    ComposeKtVisitor by CompositionLocalAllowlist() {

    override val issue: Issue = Issue(
        id = "CompositionLocalAllowlist",
        severity = Severity.CodeSmell,
        description = CompositionLocalAllowlist.CompositionLocalNotInAllowlist,
        debt = Debt.FIVE_MINS,
    )
}
