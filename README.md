# vista-svc-gateway-pipe

`vista-svc-gateway-pipe` is a compact Kotlin repository for backend services, centered on this goal: Design a Kotlin verification harness for gateway systems, covering constraint solving, bounded scenario files, and failure-oriented tests.

## Why It Exists

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Vista Svc Gateway Pipe Review Notes

The first comparison I would make is `session drift` against `queue pressure` because it shows where the rule is most opinionated.

## Features

- `fixtures/domain_review.csv` adds cases for queue pressure and retry load.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/vista-svc-gateway-walkthrough.md` walks through the case spread.
- The Kotlin code includes a review path for `session drift` and `queue pressure`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Kotlin implementation avoids hidden state so fixture changes are easy to reason about.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `recovery` is the high score at 228; `stale` is the low score at 139.

## Limitations And Roadmap

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
