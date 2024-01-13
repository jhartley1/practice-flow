<script>
	const currentDate = new Date();

	const entries = [
		{
			timestamp: Date.parse('01 Jan 1970 00:00:00 GMT'),
			message: 'Major scale in C at 50 bpm'
		},
		{
			timestamp: Date.parse('01 Jan 1970 00:00:00 GMT'),
			message: 'Another entry'
		},
		{
			timestamp: Date.parse('01 Jan 1970 00:00:00 GMT'),
			message: 'Played freight train without metronome'
		}
	];
</script>

<header>
	<h1 class="text-3xl p-4 font-extrabold">PracticeFlow</h1>
</header>

<nav class="flex justify-around">
	<a href="/" class="">yesterday</a>
	<a href="/" class="">tomorrow</a>
</nav>

<main>
	<article>
        <header class="flex justify-center">
            <time class="text-2xl font-bold" datetime={currentDate.toDateString()}>{new Intl.DateTimeFormat('en-US').format(currentDate)}</time >
        </header>
		<section>
			{#each entries as entry}
				<div class="m-4">
					<time>
						{new Intl.DateTimeFormat('en-US', { hour: 'numeric', minute: 'numeric' }).format(
							entry.timestamp
						)}
                        
					</time>
					<span>
						{entry.message}
					</span>
				</div>
			{/each}
		</section>

		<section class="flex justify-center p-5 bg-primary">
			<form class="w-full">
				<input class="w-full" />
				<button class="btn btn-secondary">Log</button>
			</form>
		</section>
	</article>
</main>
