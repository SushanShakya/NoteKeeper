package com.something.notekeeper

data class CourseInfo(val name: String, val id: String) {
    override fun toString(): String {
        return name
    }
}

data class NoteInfo(var title: String, var description: String, var course: CourseInfo){
    override fun toString(): String {
        return title
    }
}