<!DOCTYPE html>
<html>
<head>
  <title>Sports Team Player Details</title>
  <meta charset="UTF-8">
</head>
<body>
<script>
  const player1 = {
    name: "Virat Kohli",
    age: 36,
    sport: "Cricket",
    stats: { matches: 500, runs: 25000, average: 57.2 }
  };

  const { name, sport, stats: { matches, runs, average } } = player1;
  document.write(`Player ${name} plays ${sport}. Matches: ${matches} | Runs: ${runs} | Batting Average: ${average}<br>`);

  const player2 = {
    name: "Lionel Messi",
    age: 38,
    sport: "Football",
    stats: { matches: 800, goals: 720, assists: 300 }
  };

  const players = [player1, player2];
  const [p1, p2] = players;

  const { name: n1, sport: s1, stats: { matches: m1, runs: r1 = "N/A", goals: g1 = "N/A", assists: a1 = "N/A", average: avg1 = "N/A" } } = p1;
  const { name: n2, sport: s2, stats: { matches: m2, runs: r2 = "N/A", goals: g2 = "N/A", assists: a2 = "N/A", average: avg2 = "N/A" } } = p2;

  document.write(`Player ${n1} plays ${s1}. Matches: ${m1} | Runs: ${r1} | Batting Average: ${avg1}<br>`);
  document.write(`Player ${n2} plays ${s2}. Matches: ${m2} | Goals: ${g2} | Assists: ${a2}`);
</script>
</body>
</html>
