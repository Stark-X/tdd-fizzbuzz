# Tasking

## Scenario 1
GIVEN `number` is divisible by `3`,
WHEN reply the result,
THEN `Fizz` should be replied.
 
## Scenario 2
GIVEN `number` is divisible by `5`,
WHEN reply the result,
THEN `Buzz` should be replied.
 
## Scenario 3
GIVEN `number` is divisible by `7`,
WHEN reply the result,
THEN `Whizz` should be replied.

## Scenario 4
GIVEN `number` is divisible by `3`,
AND `number` is divisible by `5`,
WHEN reply the result,
THEN `FizzBuzz` should be replied.

## Scenario 5
GIVEN `number` is divisible by `3`,
AND `number` is divisible by `7`,
WHEN reply the result,
THEN `FizzWhizz` should be replied.

## Scenario 6
GIVEN `number` is divisible by `5`,
AND `number` is divisible by `7`,
WHEN reply the result,
THEN `BuzzWhizz` should be replied.

## Scenario 7
GIVEN `number` is divisible by `3`,
AND `number` is divisible by `5`,
AND `number` is divisible by `7`,
WHEN reply the result,
THEN `FizzBuzzWhizz` should be replied.

## Scenario 8
GIVEN `number` is not divisible by `3`,
AND `number` is not divisible by `5`,
AND `number` is not divisible by `7`,
WHEN reply the result,
THEN `number` it self should be replied.

## Scenario 9

GIVEN `number` is contains `3`
WHEN reply the result,
THEN `Fizz` should be replied

`sample: 31`

## Scenario 10

GIVEN `number` is contains `5`
AND `number` is divisible by `7`
WHEN reply the result,
THEN `Whizz` should be replied

`sample: 56`

## Scenario 11

GIVEN `number` is contains `5`
AND `number` is not divisible by `7`
WHEN reply the result,
THEN `number` it self should be replied

`sample: 58`

## Scenario 12

GIVEN `number` is contains `7`
AND `number` is divisible by `3`
WHEN reply the result,
THEN `Fizz` should be replied

`sample: 27`

## Scenario 13

GIVEN `number` is contains `7`
AND `number` is divisible by `7`
WHEN reply the result,
THEN `Whizz` should be replied

`sample: 77`

## Scenario 14

GIVEN `number` is contains `7`
AND `number` is contains `3`
WHEN reply the result,
THEN `Fizz` should be replied

`sample: 37`

## Scenario 15

GIVEN `number` is contains `7`
AND `number` is contains `5`
AND `number` is divisible by `7`
AND `number` is not divisible by `3`
WHEN reply the result,
THEN `Whizz` should be replied

`sample: 357`

## Scenario 16

GIVEN `number` is contains `7`
AND `number` is contains `5`
AND `number` is not divisible by `7`
WHEN reply the result,
THEN `number` it self should be replied

`sample: 157`
