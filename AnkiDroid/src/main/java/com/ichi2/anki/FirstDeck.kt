// SPDX-License-Identifier: GPL-3.0-or-later

package com.ichi2.anki

import com.ichi2.anki.libanki.Collection
import com.ichi2.anki.libanki.DeckId

/**
 * First deck in the picker order: skips an empty Default deck and filtered decks.
 * Studying this deck includes its subdecks (Anki parent-deck behaviour).
 */
fun Collection.firstUserDeckId(): DeckId? =
    decks
        .allNamesAndIds(skipEmptyDefault = true, includeFiltered = false)
        .firstOrNull()
        ?.id
