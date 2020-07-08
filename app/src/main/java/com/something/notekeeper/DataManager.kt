package com.something.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo(id = "android_intents", name = "Android Programming with Intents")
        courses.set(course.id, course)

        course = CourseInfo("Android Asynchronous Programming", "android_async")
        courses.set(course.id, course)

        course = CourseInfo("Java fundamentals", "java_lang")
        courses.set(course.id, course)

        course = CourseInfo(name = "Kotlin Fundamentals", id = "kotlin_lang")
        courses.set(course.id, course)
    }

    private fun initializeNotes() {
        notes.add(
            NoteInfo(
                title = "Using Intent Filter",
                description = "We use Intents to navigate from one activity to another",
                course = CourseInfo("Android Asynchronous Programming", "android_async")
            )
        )
        notes.add(
            NoteInfo(
                title = "Learning to use something",
                description = "Lol This is the next part lol",
                course = CourseInfo("Java fundamentals", "java_lang")
            )
        )
        notes.add(
            NoteInfo(
                title = "We are wanderring",
                description = "we are going to be doing something",
                course = CourseInfo(name = "Kotlin Fundamentals", id = "kotlin_lang")
            )
        )
    }
}