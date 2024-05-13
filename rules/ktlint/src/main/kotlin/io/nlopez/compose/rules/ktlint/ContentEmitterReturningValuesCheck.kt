// Copyright 2023 Nacho Lopez
// SPDX-License-Identifier: Apache-2.0
package io.nlopez.compose.rules.ktlint

import io.nlopez.compose.core.ComposeKtVisitor
import io.nlopez.compose.rules.ContentEmitterReturningValues
import io.nlopez.compose.rules.KtlintRule

class ContentEmitterReturningValuesCheck :
    KtlintRule(
        id = "compose:content-emitter-returning-values-check",
        editorConfigProperties = setOf(contentEmittersProperty),
    ),
    ComposeKtVisitor by ContentEmitterReturningValues()
