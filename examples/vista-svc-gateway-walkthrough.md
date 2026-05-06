# Vista Svc Gateway Pipe Walkthrough

This walk-through keeps the domain vocabulary close to the data instead of burying it in prose.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | queue pressure | 143 | ship |
| stress | retry load | 215 | ship |
| edge | worker slack | 188 | ship |
| recovery | session drift | 228 | ship |
| stale | queue pressure | 139 | watch |

Start with `recovery` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The next useful expansion would be a malformed fixture around retry load and session drift.
