// Copyright 2023 Nacho Lopez
// SPDX-License-Identifier: Apache-2.0
package io.nlopez.compose.rules.ktlint

import io.nlopez.compose.core.ComposeKtVisitor
import io.nlopez.compose.rules.CompositionLocalAllowlist
import io.nlopez.compose.rules.KtlintRule

class CompositionLocalAllowlistCheck :
    KtlintRule(
        id = "compose:compositionlocal-allowlist",
        editorConfigProperties = setOf(compositionLocalAllowlistProperty),
    ),
    ComposeKtVisitor by CompositionLocalAllowlist()
