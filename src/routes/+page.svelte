<script>
	const currentDate = new Intl.DateTimeFormat('en-US').format(new Date());

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

<nav>
	<h1 class="text-3xl p-4 font-extrabold">PracticeFlow</h1>
</nav>

<div class="flex justify-center">
    <a href="/" class="">yesterday</a>
	<span class="text-2xl font-bold">{currentDate}</span>
    <a href="/" class="">tomorrow</a>

</div>

<div class="">
	{#each entries as entry}
        <div class="m-4">
            <span>
                {new Intl.DateTimeFormat('en-US', {hour: 'numeric', minute: 'numeric'}).format(entry.timestamp)}
            </span>
            <span>
                {entry.message}
            </span>
        </div>
		
	{/each}
</div>

<div class="flex justify-center">
    <form class="w-full">
        <input class="w-full"/>
        <button class="btn btn-primary">Log</button>
    </form>
</div>
